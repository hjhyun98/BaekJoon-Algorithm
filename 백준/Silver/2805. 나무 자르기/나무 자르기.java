import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] trees;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        trees = new int[n];
        int min = 0;
        int max = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            trees[i] = Integer.parseInt(st.nextToken());
            if(max < trees[i]) max = trees[i];
        }

        while(min < max){
            int mid = (max+min)/2;
            long sum = 0;
            for(int i:trees){
                if(i - mid > 0) sum += (i-mid);
            }

            if(sum < m) max = mid;
            else min = mid+1;
        }

        System.out.println(min-1);
    }
}
