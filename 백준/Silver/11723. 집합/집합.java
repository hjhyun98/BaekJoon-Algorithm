import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        int m = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i<m;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x;
            switch (st.nextToken()){
                case "add":
                    x = Integer.parseInt(st.nextToken());
                    set.add(x);
                    break;
                case "remove":
                    x = Integer.parseInt(st.nextToken());
                    set.remove(x);
                    break;
                case "check":
                    x = Integer.parseInt(st.nextToken());
                    if(set.contains(x))
                        bw.write(1+"\n");
                    else
                        bw.write(0+"\n");
                    break;
                case "toggle":
                    x = Integer.parseInt(st.nextToken());
                    if(set.contains(x))
                        set.remove(x);
                    else
                        set.add(x);
                    break;
                case "all":
                    for(int j=1;j<=20;j++)
                        set.add(j);
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }
        br.close();
        bw.close();
    }

}
