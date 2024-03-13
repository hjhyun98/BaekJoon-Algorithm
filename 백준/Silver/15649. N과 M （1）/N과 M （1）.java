import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        permutation(n,m,new int[m], 0);

        System.out.print(sb);
    }

    private static void permutation(int n, int m, int[] result, int cnt){
        if(cnt == m){
            for(int i = 0; i < m; i++){
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");

            return;
        }
        else{
            for(int i = 1; i <= n; i++){
                if(check_repetition(cnt, result, i)) continue;
                result[cnt] = i;
                permutation(n,m,result,cnt+1);
            }
        }
    }

    private static boolean check_repetition(int cnt, int[] result, int i){
        for(int j = cnt-1; j >= 0; j--){
            if(result[j] == i) return true;
        }
        return false;
    }
}
