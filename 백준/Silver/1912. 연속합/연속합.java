import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n+1];
        Integer[] dp = new Integer[n+1];

        for(int i =1; i<=n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = arr[1];
        dp[1] = max;

        for(int i = 2; i <= n; i++){
            max = Math.max(max+arr[i], arr[i]);
            dp[i] = max;
        }

        for( int i = 1; i <= n; i++){
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
