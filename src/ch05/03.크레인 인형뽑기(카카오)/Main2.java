import java.io.*;
import java.util.*;

public class Main2 {
	public static int move(int[][] board, int[] point, Stack<Integer> basket, int n) {
		if (point[n] == -1) {
			return 0;
		}
		int num = board[n][point[n]];
		board[n][point[n]--] = 0;
		if (!basket.isEmpty() && (basket.peek() == num)) {
			basket.pop();
			return 2;
		} else {
			basket.push(num);
			return 0;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[][] board = new int[N][N];
		int[] point = new int[N];
		for (int i = 0; i < N; i++) {
			point[i] = N - 1;
		}
		StringTokenizer st;
		for (int i = N - 1; i >= 0; i--) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int num = Integer.parseInt(st.nextToken());
				board[j][i] = num;
				if (num == 0) {
					point[j]--;
				}
			}
		}

		Stack<Integer> basket = new Stack<>();
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int result = 0;
		for (int i = 0; i < M; i++) {
			result += move(board, point, basket, Integer.parseInt(st.nextToken()) - 1);
		}

		bw.write(result + "");
		bw.flush();
		bw.close();
		br.close();
	}
}