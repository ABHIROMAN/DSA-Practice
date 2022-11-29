package GFG30days.Day20;

import java.util.*;

public class wordBoggle {
    
    public boolean dfs(char board[][], boolean visited[][], String word, int x, int y, int n, int m) {

        if(word.length() == 0) return true;

        if(x < 0 || y < 0 || x >= n || y >= m || visited[x][y] || board[x][y] != word.charAt(0)) {

            return false;
        }
        visited[x][y] = true;

        word = word.substring(1);

        boolean left = dfs(board, visited, word, x, y-1, n, m);
        boolean right = dfs(board, visited, word, x, y+1, n, m);
        boolean top = dfs(board, visited, word, x+1, y, n, m);
        boolean bottom = dfs(board, visited, word, x-1, y, n, m);
        boolean right_top = dfs(board, visited, word, x+1, y+1, n, m);
        boolean left_top = dfs(board, visited, word, x+1, y-1, n, m);
        boolean right_bottom = dfs(board, visited, word, x-1, y+1, n, m);
        boolean left_bottom = dfs(board, visited, word, x-1, y-1, n, m);

        visited[x][y] = false;

        return left || right || top || bottom || right_top || left_top || right_bottom || left_bottom;
    }

    public String[] wordBoggleProblem(char board[][], String dictionary[]) {

        int R = board.length;
        int C = board[0].length;

        Set<String> set = new HashSet<>();
        boolean vis[][] = new boolean[R][C];

        for(String word : dictionary) {

            for(int i = 0; i < R; i++) {

                for(int j = 0; j <C; j++) {

                    if(board[i][j] == word.charAt(0)) {

                        if(dfs(board, vis, word, i, j, R, C) == true) {

                            set.add(word);
                            break;
                        }
                    }
                }
            }
        }

        int i = 0;
        String str[] = new String[set.size()];
        for(String s : set) {

            str[i++] = s;
        }

        return str;
    }
}
