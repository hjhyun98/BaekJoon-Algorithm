import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[][] arr;
    static boolean[] check;
    static int cnt = -1;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        arr = new int[n+1][n+1];
        check = new boolean[n+1];

        for(int i = 0; i < k;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            arr[n1][n2] = arr[n2][n1] = 1;
        }
        
        dfs(1);

        System.out.println(cnt);
    }

    public static void dfs(int start){
        cnt++;
        check[start] = true;
        
        for(int i = 0;i <= n;i++){
            if(arr[start][i] == 1 && !check[i])
                dfs(i);
        }
    }
}
