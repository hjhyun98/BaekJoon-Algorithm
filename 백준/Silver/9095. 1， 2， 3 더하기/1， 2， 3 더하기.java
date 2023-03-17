import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t= Integer.parseInt(br.readLine());
		
		int[] sum = new int[11];
		sum[1] = 1;
		sum[2] = 2;
		sum[3] = 4;
		
		for(int i = 4;i<11;i++) {
			sum[i] = sum[i-1]+sum[i-2]+ sum[i-3];
		}
		
		
		for(int i =0;i<t;i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(sum[n]);
		}
		
		
	}

}
