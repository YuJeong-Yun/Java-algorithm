import java.io.*;
import java.util.*;

public class Main2 {

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
		for (int i = 0; i < K; i++) {
			max += sales[i];
		}
		int temp = max;
		for (int i = 1; i <= N - K; i++) {
			temp -= sales[i - 1];
			temp += sales[i + K - 1];

			max = Math.max(max, temp);
 		}

		bw.write(max+"");
		bw.flush();
		bw.close();
		br.close();
	}

}
