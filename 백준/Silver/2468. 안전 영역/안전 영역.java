import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] mat;
    static boolean[][] visited;
    static int n;
    static int[] dx = {0,-1,0,1};
    static int[] dy = {1,0,-1 ,0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        mat = new int[n][n];
        int max = 0;

        for(int i = 0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j =0;j<n;j++){
                mat[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, mat[i][j]);
            }
        }

        int tempMax =0;
        for(int height = 0; height <= max;height++){
            visited = new boolean[n][n];
            int count = 0;
            for(int i =0; i<n;i++){
                for(int j = 0; j < n; j++){
                    if(!visited[i][j] && mat[i][j] > height){
                        count += dfs(i,j,height);
                    }
                }
            }
            tempMax = Math.max(tempMax,count);
        }
        System.out.println(tempMax);
    }
    
    static int dfs(int x, int y, int height){
        visited[x][y] = true;
        
        for(int i =0; i < 4;i++){
            int newX = x+dx[i];
            int newY = y+dy[i];
            
            if(newX <0 || newY < 0 || newX >= n || newY >= n) continue;
            if(visited[newX][newY]) continue;
            if(mat[newX][newY] > height) dfs(newX,newY,height);
        }
        return 1;
    }
}
