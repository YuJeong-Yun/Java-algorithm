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

		boolean[] sequence = new boolean[N];
		for (int i = 0; i < N; i++) {
			String str = st.nextToken();
			sequence[i] = str.equals("1") ? true : false;
		}

		int max = 0;
		for (int i = 0; i <= N - K; i++) {
			int temp = 0, j = i, k = K;
			while (j < N) {
				if (sequence[j]) {
					temp++;
					j++;
				} else if (!sequence[j] && k > 0) {
					k--;
					temp++;
					j++;
				} else {
					break;
				}
			}
			max = Math.max(max, temp);
		}

		bw.write(max + "");

		bw.flush();
		bw.close();
		br.close();
	}
}