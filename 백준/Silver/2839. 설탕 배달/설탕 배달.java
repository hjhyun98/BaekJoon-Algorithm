import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(getAnswer(n));
    }

    static int getAnswer(int n) {
        if (n < 6) {
            if (n == 3 || n == 5)
                return 1;
            else
                return -1;
        } else {
            int[] arr = new int[n + 1];
            arr[1] = -1;
            arr[2] = -1;
            arr[3] = 1;
            arr[4] = -1;
            arr[5] = 1;

            for (int i = 6; i < n + 1; i++) {
                if (arr[i - 5] < 0) {
                    if (arr[i - 3] < 0)
                        arr[i] = -1;
                    else
                        arr[i] = arr[i - 3] + 1;
                }
                else if (arr[i - 3] < 0) arr[i] = arr[i - 5] + 1;
                else arr[i] = arr[i - 5] < arr[i - 3] ? arr[i - 5] + 1 : arr[i - 3] + 1;
            }

            return arr[n];

        }
    }
}
