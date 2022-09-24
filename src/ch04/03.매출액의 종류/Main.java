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

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < K; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		bw.write(map.size() + " ");

		for (int i = 1; i <= N - K; i++) {
			if (map.get(nums[i - 1]) == 1) {
				map.remove(nums[i - 1]);
			} else {
				map.put(nums[i - 1], map.get(nums[i - 1]) - 1);
			}
			map.put(nums[K + i - 1], map.getOrDefault(nums[K + i - 1], 0) + 1);
			
			bw.write(map.size()+" ");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}