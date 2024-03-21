import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            if(n == 0) {
                System.out.println("1 0");
                continue;
            }
            if(n == 1){
                System.out.println("0 1");
                continue;
            }

            int[] zero = new int[n+1];
            int[] one = new int[n+1];
            zero[0] = 1;
            one[1] = 1;

            for(int j = 2; j < n+1; j++){
                zero[j] = zero[j-2] + zero[j-1];
                one[j] = one[j-2] + one[j-1];
            }

            System.out.println(zero[n]+" "+one[n]);
        }
    }

}
