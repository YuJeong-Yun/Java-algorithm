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

		int[] nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		Set<Integer> rank = new HashSet<>();
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					rank.add(nums[i] + nums[j] + nums[k]);
				}
			}
		}

		List<Integer> rankList = new ArrayList<>(rank);
		Collections.sort(rankList);

		if (rankList.size() < K) {
			bw.write("-1");
		} else {
			bw.write(rankList.get(rankList.size() - K) + "");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}