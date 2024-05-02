import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] direction = {{0,1}, {1,0}, {0,-1}, {-1,0}};
    static int[][] mat;
    static boolean[][] visited;
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        mat = new int[N][M];

        for(int i = 0 ; i < N;i++) {
            for (int j = 0; j <= M; j++) {
                int temp = br.read() - 48;
                if (temp != -38)
                    mat[i][j] = temp;
            }
        }

        visited = new boolean[N][M];
        visited[0][0] = true;
        bfs(0,0);
        System.out.println(mat[N-1][M-1]);

    }


    static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x,y});

        while(!queue.isEmpty()){
            int now[] = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int[] d : direction){
                int nextX = nowX + d[0];
                int nextY = nowY + d[1];

                if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= M)
                    continue;
                if(visited[nextX][nextY] || mat[nextX][nextY] == 0)
                    continue;
                queue.add(new int[] {nextX,nextY});
                mat[nextX][nextY] = mat[nowX][nowY] + 1;
                visited[nextX][nextY] = true;
            }
        }
    }
}
