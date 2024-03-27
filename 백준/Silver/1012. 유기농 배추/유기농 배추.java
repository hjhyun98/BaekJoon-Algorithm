import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int cnt;
    static int[][] direction = {{0,-1},{1,0},{0,1},{-1,0}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int N, M, K;
        int[][] mat;

        for(int i=0;i<T;i++){
            cnt = 0;
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            mat = new int[N][M];
            for(int j = 0; j < K; j++){
                st = new StringTokenizer(br.readLine());
                mat[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            for(int j = 0; j < N;j++){
                for(int r = 0; r < M; r++){
                    if(mat[j][r] == 1) {
                        check(j,r,mat);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    static void check(int x, int y, int[][] t){
        t[x][y] = 0;

        for(int i = 0; i < 4; i++){
            int newX = x+direction[i][0];
            int newY = y+direction[i][1];
            if(newX < 0 || newY < 0 || newX >= t.length || newY >= t[1].length) continue;
            if(t[newX][newY] == 1){
                check(newX, newY, t);
            }
        }
    }

}
