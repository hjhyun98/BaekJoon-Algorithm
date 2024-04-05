import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static boolean[] visitied;
    static ArrayList<Integer> list[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        list = new ArrayList[n+1];
        visitied = new boolean[n+1];
        int cnt = 0;

        for(int i = 1; i<= n;i++){
            list[i] = new ArrayList<>();
        }

        //인접리스트
        for(int i = 1 ;i <= m;i++){
            st = new StringTokenizer(br.readLine());
            int U = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            list[U].add(V);
            list[V].add(U);
        }

        for(int i = 1; i <= n; i++){
            if(visitied[i]) continue;;
            //dfs(i);
            bfs(i);
            cnt++;
        }

        System.out.println(cnt);
    }
    static void dfs(int n){
        visitied[n] = true;
        for(int i : list[n]){
            if(visitied[i]) continue;
            dfs(i);
        }
    }

    static void bfs(int n){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        visitied[n] = true;
        while(!queue.isEmpty()){
            int now = queue.poll();
            for(int next : list[now]){
                if(visitied[next]) continue;
                queue.offer(next);
                visitied[next] = true;
            }
        }
    }

}
