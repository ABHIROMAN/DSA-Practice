package GFG30days.Day29;

public class rotateMatrixElement {
    
    int[][] rotateMatrix(int M, int N, int Mat[][]) {

        int row = 0, col = 0; 

        while(row < M && col < N) {

            if(row + 1 == M || col + 1 == N) break;

            int current = 0;
            int prev = Mat[row+1][col];

            for(int i = col; i < N; i++) {
                current = Mat[row][i];
                Mat[row][i] = prev;
                prev = current;
            }
            row++;

            for(int i = row; i < M; i++) {
                current = Mat[i][N-1];
                Mat[i][N-1] = prev;
                prev = current;
            }
            N--;

            if(col < N) {

                for(int i = M - 1; i >= row; i--) {
                    current = Mat[i][col];
                    Mat[i][col] = prev;
                    prev = current;
                }
            }
            col++;
        }
        return Mat;
    }
}
