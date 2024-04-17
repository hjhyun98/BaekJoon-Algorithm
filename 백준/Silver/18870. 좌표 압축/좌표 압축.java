import static java.util.Arrays.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] original = new int[N];
        int[] sorted = new int[N];
        HashMap<Integer, Integer> rankingMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());;
        for(int i = 0 ; i < N; i++){
            int k = Integer.parseInt(st.nextToken());
            original[i] = k;
            sorted[i] = k;
        }

        sort(sorted);

        int rank = 0;
        for(int i: sorted){
            if(!rankingMap.containsKey(i)){
                rankingMap.put(i, rank);
                rank++;
            }
        }

        for(int i : original){
            sb.append(rankingMap.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}
