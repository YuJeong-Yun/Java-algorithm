import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		int[] num = new int[N+M];
		for(int i=0; i<N; i++) {
			num[i] = Integer.parseInt(st1.nextToken());
		}
		for(int i=N; i<N+M; i++) {
			num[i] = Integer.parseInt(st2.nextToken());
		}
		
		Arrays.sort(num);
		for(int i=0; i<N+M; i++) {
			bw.write(num[i]+" ");
		}
		
		
				
		bw.flush();
		bw.close();
		br.close();
	}
}