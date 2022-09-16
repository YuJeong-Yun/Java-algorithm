import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[][] students = new int[N][5];
		int[] cnt = new int[N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				students[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < 5; k++) {
					if(students[i][k]==students[j][k]){
						cnt[i]++;
						break;
					}
				}
			}
		}

		int max = Arrays.stream(cnt).max().getAsInt();
		for (int i = 0; i < N; i++) {
			if (cnt[i] == max) {
				bw.write(i + 1 + "");
				break;
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}