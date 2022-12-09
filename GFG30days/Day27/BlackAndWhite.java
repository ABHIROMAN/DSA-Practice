package GFG30days.Day27;

public class BlackAndWhite {
    
    private static long MOD = 1000000007;
    
    static long numOfWays(int N, int M)
    {
        // add your code here
        long ans = 0;

        long totalCount = N * M - 1;

        int[] dx = {-2,-2,2,2,1,1,-1,-1};

        int[] dy = {1,-1,-1,1,-2,2,2,-2};

        for(int i =0 ; i < N ; i++){

            for(int j = 0 ; j < M ; j++){

                int cnt = 0;

                for(int k = 0 ;k < dx.length; k++){

                    int nx = dx[k] + i;

                    int ny = dy[k] + j;

                    if(nx >=0 && ny >= 0 && nx < N && ny < M){

                        cnt++;

                    }

                }

                ans = ans + (totalCount - cnt)%MOD;

                ans = ans%MOD; 

            }

        }

        return ans;

    }
}
