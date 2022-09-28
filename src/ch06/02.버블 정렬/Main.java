import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] nums = new int[N];

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			nums[i] = num;
		}

		for (int i = 0; i < N; i++) {
			for (int j = 1; j < N - i ; j++) {
				if (nums[j - 1] > nums[j]) {
					int tmp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = tmp;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			bw.write(nums[i] + " ");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}