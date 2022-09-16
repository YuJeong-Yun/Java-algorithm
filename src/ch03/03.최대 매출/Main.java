import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());

		int[] sales = new int[N];
		for (int i = 0; i < N; i++) {
			sales[i] = Integer.parseInt(st.nextToken());
		}

		int max = 0;
		for (int i = 0; i <= N - K; i++) {
			int temp = 0;
			int j = i;
			while (j < i + K) {
				temp += sales[j++];
			}
			max = Math.max(max, temp);
		}

		bw.write(max+"");
		bw.flush();
		bw.close();
		br.close();
	}
}