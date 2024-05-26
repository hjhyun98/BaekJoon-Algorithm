import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] sticker;
    static int[][] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T;i++) {
            n = Integer.parseInt(br.readLine());
            sticker = new int[2][n + 1];
            dp = new int[2][n + 1];

            for(int j = 0;j<2;j++){
                StringTokenizer tokenizer = new StringTokenizer(br.readLine());
                for(int k = 1;k<=n;k++){
                    sticker[j][k]=Integer.parseInt(tokenizer.nextToken());
                }
            }

            dp[0][1] = sticker[0][1];
            dp[1][1] = sticker[1][1];

            for(int k = 2; k <= n; k++){
                dp[0][k]= Math.max(dp[1][k-1], dp[1][k-2])+sticker[0][k];
                dp[1][k] = Math.max(dp[0][k-1], dp[0][k-2])+sticker[1][k];
            }

            System.out.println(Math.max(dp[0][n], dp[1][n]));
        }

    }
}
