import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[][] nums = new int[N][N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int j = 0; j < N; j++) {
				nums[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int widthMax = 0, heightMax = 0, diagMax = 0, d1 = 0, d2 = 0;
		for (int i = 0; i < N; i++) {
			int wTemp = 0, hTemp = 0;
			for (int j = 0; j < N; j++) {
				wTemp += nums[i][j];
				hTemp += nums[j][i];
				if (i == j) {
					d1 += nums[i][j];
				}
				if (i + j == N-1) {
					d2 += nums[i][j];
				}
			}
			widthMax = Math.max(widthMax, wTemp);
			heightMax = Math.max(heightMax, hTemp);
		}
		diagMax = Math.max(d1, d2);
		int max = Math.max(widthMax, heightMax);
		max = Math.max(max, diagMax);
		
		bw.write(max+"");

		bw.flush();
		bw.close();
		br.close();
	}
}