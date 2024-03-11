import java.util.Scanner;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        permutation(N,M,0,new int[M]);
        System.out.println(sb);
    }

    private static void permutation(int n, int m, int cnt, int[] result){
        if(cnt == m){
            for(int i = 0 ; i < m; i++){
                sb.append(result[i])
                                .append(" ");
            }
            sb.append("\n");
            return;
        }
        else{
            for(int i = 1;i <= n; i++){
                result[cnt] = i;
                permutation(n,m,cnt+1, result);
            }
        }
    }
}
