import java.io.*;
import java.util.*;

public class Main2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		String[] scores = new String[M];
		for (int i = 0; i < M; i++) {
			scores[i] = " " + br.readLine() + " ";
		}

		int cnt = 0;
		for (int i = 1; i <= N; i++) {
			out: for (int j = 1; j <= N; j++) {
				for (int k = 0; k < M; k++) {
					if (scores[k].indexOf(" " + i + " ") >= scores[k].indexOf(" " + j + " ")) {
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