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

		int[] nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		Set<Integer> rank = new TreeSet<>(Collections.reverseOrder());
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					rank.add(nums[i] + nums[j] + nums[k]);
				}
			}
		}

		Iterator<Integer> it = rank.iterator();
		int result = 0;
		if (rank.size() < K) {
			result = -1;
		} else {
			while (K-- >= 1) {
				result = it.next();
			}
		}

		bw.write(result + "");
		bw.flush();
		bw.close();
		br.close();
	}
}