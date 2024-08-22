import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {-1,-1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringTokenizer st;

        while(true) {
            s = br.readLine();
            if(s.equals("0 0")) break;

            st = new StringTokenizer(s);
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            int[][] mat = new int[h][w];
            boolean[][] visited = new boolean[h][w];
            int cnt = 0;

            for(int i = 0; i< h;i++){
                String str = br.readLine();
                st = new StringTokenizer(str);
                for(int j = 0; j < w; j++){
                    mat[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for(int i =0;i<h;i++){
                for(int j = 0; j < w; j++){
                    if(mat[i][j] == 1 && !visited[i][j]) {
                        dfs(mat, visited, i, j, w, h);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }

    }

    public static void dfs(int[][] mat, boolean[][] visited, int x, int y, int w, int h){
        visited[x][y] = true;

        for(int i = 0; i < dx.length; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (newX >= 0 && newY >= 0 && newX < h && newY < w) {
                if (!visited[newX][newY] && mat[newX][newY] == 1) {
                    dfs(mat, visited, newX, newY, w, h);
                }
            }
        }
    }
}
