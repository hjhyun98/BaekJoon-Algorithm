import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] input = str.toCharArray();
        ArrayList<Character> stack = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < input.length; i++){
            if(input[i] == '('){
                stack.add(input[i]);
            }
            else{
                int idx = stack.size()-1;
                if(input[i-1] == '(') {
                    stack.remove(idx);
                    count += stack.size();
                }
                else{
                    stack.remove(idx);
                    count += 1;
                }
            }
        }

        System.out.println(count);
    }
}
