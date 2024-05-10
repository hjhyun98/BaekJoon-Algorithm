import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[][] mat;
    static boolean[][] visited;
    static int[] dirX = {0,-1,0,1};
    static int[] dirY = {1,0,-1,0};
    static ArrayList<Integer> value = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        mat = new int[N][N];
        visited = new boolean[N][N];
        int cnt = 0;

        for(int i = 0; i < N; i++){
            String[] strArr = br.readLine().split("");
            for(int j = 0; j < N; j++){
                mat[i][j] = Integer.parseInt(strArr[j]);
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(mat[i][j] == 1 && !visited[i][j]){
                    cnt++;
                    value.add(0);
                    getComplex(i,j);
                }
            }
        }

        System.out.println(cnt);
        value.sort(Comparator.naturalOrder());
        for(int i : value){
            System.out.println(i);
        }
    }

    static void getComplex(int x, int y){
        Queue<int[]> queue = new LinkedList<>();

        if(!visited[x][y]){
            value.set(value.size()-1, value.get(value.size()-1)+1);
            visited[x][y] = true;
        }

        for(int i = 0; i < 4; i++){
            int newX = x+dirX[i];
            int newY = y+dirY[i];

            if(newX >= 0 && newX < N && newY >= 0 && newY < N){
                if(mat[newX][newY] == 1 && !visited[newX][newY]){
                    queue.offer(new int[]{newX, newY});
                }
            }

        }
        while(!queue.isEmpty()){
            int[] nextPoint = queue.poll();
            getComplex(nextPoint[0], nextPoint[1]);
        }
    }
}
