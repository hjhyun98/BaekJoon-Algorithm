import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 0;
        for(int i = 0; i < n; i++){
            char[] chars = br.readLine().toCharArray();
            ArrayList<Character> check = new ArrayList<>();
            check.add(chars[0]);
            boolean flag = false;

            for(int j = 1; j < chars.length; j++){
                if(chars[j-1] != chars[j]){
                    if(check.contains(chars[j])){
                        flag = true;
                        break;
                    }
                    check.add(chars[j]);
                }
            }

            if(!flag) num++;
        }

        System.out.println(num);

    }

}
