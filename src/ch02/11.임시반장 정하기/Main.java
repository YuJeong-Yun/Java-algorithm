import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] scores = new int[N][M];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int num = Integer.parseInt(st.nextToken());
				scores[num - 1][i] = j;
			}
		}

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			out:for (int j = 0; j < N ; j++) {
				for (int k = 0; k < M; k++) {
					if (scores[i][k] <= scores[j][k]) {
						continue out;
					}
				}
				cnt++;
			}
		}

		bw.write(cnt + "");
		bw.flush();
		bw.close();
		br.close();
	}
}