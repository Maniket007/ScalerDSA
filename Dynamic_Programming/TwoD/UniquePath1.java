package Dynamic_Programming.TwoD;

public class UniquePath1 {
    public static void main(String[] args) {
        int n = 3;
        int m = 7;  
        System.out.println(solve(n, m));
    }
    public static int solve(int n, int m)
    {
        int dp[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j] = 1;
                }
                else
                {
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[n-1][m-1];
    }
}
