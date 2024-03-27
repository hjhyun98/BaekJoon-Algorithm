import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static Queue<Integer> queue = new LinkedList<>();
    static int[][] edge;

    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();

        edge = new int[n+1][n+1];
        visit = new boolean[n+1];

        for(int i = 0; i < m; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            edge[l][r] = edge[r][l] = 1;
        }

        dfs(start, n);
        sb.append("\n");
        visit = new boolean[n+1];
        bfs(start, n);
        System.out.println(sb);
    }

    static void dfs(int node, int n){
        visit[node] = true;
        sb.append(node+" ");
        for(int i = 1; i <= n;i++){
            if(edge[node][i] == 1 && !visit[i]) dfs(i,n);
        }
    }

    static void bfs(int node,int n){
        queue.add(node);
        visit[node] = true;
        while(!queue.isEmpty()){ //큐에 있을 때 까지
            node = queue.poll();
            sb.append(node +" ");

            for(int i = 1; i <= n; i++){
                if(edge[node][i] == 1 && !visit[i]){
                    queue.add(i);
                    visit[i] = true;
                }
            }

        }
    }
}
