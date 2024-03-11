import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static int NUMBERS_OF_INPUT = 6;

    public static void main(String[] args) throws IOException{
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int round;
        round = Integer.parseInt(br.readLine());

        for(int i = 0; i < round; i++){
            int[] targetArray = new int[NUMBERS_OF_INPUT];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < NUMBERS_OF_INPUT; j++){
                targetArray[j] = Integer.parseInt(st.nextToken());
            }
            System.out.println(T.getAnswer(targetArray));
        }

    }

    int getAnswer(int[] input){
        if(input[0] == input[3] && input[1] == input[4] && input[2] == input[5]) {
            return -1;
        }
        else{
            double d = getDistance(input[0], input[1], input[3], input[4]);
            int r1 = input[2];
            int r2 = input[5];
            int sub = Math.abs((r1-r2));

            if(sub < d && d < r1+r2) return 2;
            else if(sub == d || r1+r2 == d) return 1;
            else return 0;
        }
    }

    double getDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }
}
