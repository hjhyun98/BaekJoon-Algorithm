import java.io.*;
import java.util.*;

public class Main {

	public static int[] arr;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
	
		Arrays.sort(arr);
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			if(binarySearch(Integer.parseInt(st.nextToken()))>=0) {
				sb.append(1).append('\n');
			}
			else {
				sb.append(0).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	public static int binarySearch(int key) {
		int left = 0;
		int right = arr.length -1;
		
		while(left <= right) {
			int mid = (left+right)/2;
			if(key < arr[mid]) {
				right = mid-1;
			}
			else if (key > arr[mid]){
				left = mid+1;
			}
			else {
				return mid;
			}
		}
		
		return -1;
	}

}
