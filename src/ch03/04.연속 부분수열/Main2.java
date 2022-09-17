import java.io.*;
import java.util.*;

public class Main2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());

		int[] nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		int lt = 0, sum = 0, cnt = 0;
		for (int rt = 0; rt < N; rt++) {
			sum += nums[rt];
			while (sum > M) {
				sum -= nums[lt++];
			}
			if (sum == M) {
				cnt++;
				sum -= nums[lt++];
			}
		}
		bw.write(cnt+"");

		bw.flush();
		bw.close();
		br.close();
	}

}
