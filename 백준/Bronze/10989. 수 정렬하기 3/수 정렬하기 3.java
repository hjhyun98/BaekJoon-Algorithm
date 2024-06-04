import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] intArr = new int[100001];

        for(int i = 0 ;i < N;i++){
            intArr[Integer.parseInt(br.readLine())]++;
        }

        StringBuilder sb= new StringBuilder();
        for(int i=1;i<10001;i++){
            if(intArr[i] >= 1){
                for(int j =0;j<intArr[i];j++){
                    sb.append(i);
                    sb.append('\n');
                }
            }
        }

        System.out.print(sb);

    }
}
