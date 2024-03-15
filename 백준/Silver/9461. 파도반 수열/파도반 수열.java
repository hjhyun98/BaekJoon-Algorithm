import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        long[] P = new long[101];
        P[1] = 1;
        P[2] = 1;
        P[3] = 1;
        P[4] = 2;
        P[5] = 2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            System.out.println(pado(Integer.parseInt(br.readLine()), P));
        }
    }

    static long pado(int n, long[] P){
        if(n < 6 || P[n] != 0) return P[n];
        else{
            P[n] =  pado(n-5, P) + pado(n-1, P);
            return P[n];
        }
    }

}
