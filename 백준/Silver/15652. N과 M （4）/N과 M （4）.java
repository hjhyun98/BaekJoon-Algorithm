import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        combination_with_repetition(n,m,0,new int[m]);

        System.out.println(sb);
    }

    private static void combination_with_repetition(int n, int m, int cnt, int[] result){
        if(cnt == m){
            for(int i = 0; i < m; i++){
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        else {
            for(int i = 1; i <= n; i++){
                if(cnt > 0 && result[cnt-1] > i) continue;
                else{
                    result[cnt] = i;
                    combination_with_repetition(n, m, cnt+1, result);
                }
            }
        }
    }

}
