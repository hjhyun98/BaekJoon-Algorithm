import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static boolean[] primeList = new boolean[246913];
    static int[] countPrimeNum = new int[246913];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Arrays.fill(primeList,true);
        getPrime();
        getCount();

        while(n > 0){

            sb.append(countPrimeNum[2*n]-countPrimeNum[n]).append('\n');

            n = Integer.parseInt(br.readLine());
        }

        System.out.println(sb);
    }

    static void getPrime(){
        primeList[0] = false;
        primeList[1] = false;

        for(int i = 2; i <=  Math.sqrt(primeList.length); i++){
            if(!primeList[i]) continue;
            for(int j = i*i ; j < primeList.length ; j += i)
                primeList[j] = false;
        }
    }

    static void getCount(){
        int cnt = 0;
        for(int i = 2; i < primeList.length; i++){
            if(primeList[i]) cnt++;
            countPrimeNum[i] = cnt;
        }
    }
}
