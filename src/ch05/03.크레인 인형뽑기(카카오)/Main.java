import java.io.*;
import java.util.*;

public class Main {
	public static int move(int[][] board, int[] sp, List<Integer> basket, int n) {
		if (sp[n] == -1) {
			return 0;
		}
		basket.add(board[n][sp[n]]);
		board[n][sp[n]--] = 0;
		if (basket.size() > 1 && (basket.get(basket.size() - 1) == basket.get(basket.size() - 2))) {
			basket.remove(basket.size() - 1);
			basket.remove(basket.size() - 1);
			return 2;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[][] board = new int[N][N];
		int[] sp = new int[N];
		for (int i = 0; i < N; i++) {
			sp[i] = N - 1;
		}
		StringTokenizer st;
		for (int i = N - 1; i >= 0; i--) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int num = Integer.parseInt(st.nextToken());
				board[j][i] = num;
				if (num == 0) {
					sp[j]--;
				}
			}
		}

		List<Integer> basket = new ArrayList<>();
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int result = 0;
		for (int i = 0; i < M; i++) {
			result += move(board, sp, basket, Integer.parseInt(st.nextToken()) - 1);
		}

		bw.write(result + "");
		bw.flush();
		bw.close();
		br.close();
	}
}