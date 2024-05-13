import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n+1][10];
        dp[1] = new int[]{0, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int MOD = 1000000000;
        for(int i = 2;i<=n;i++){
            dp[i][0] = dp[i-1][1] % MOD;
            dp[i][9] = dp[i-1][8] % MOD;
            for(int j = 1; j < 9; j++){
                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1])% MOD;
            }
        }

        int sum = 0;
        for(int i = 0; i < 10; i++){
            sum = (sum + dp[n][i]) % MOD;
        }

        System.out.println(sum);

    }

}
