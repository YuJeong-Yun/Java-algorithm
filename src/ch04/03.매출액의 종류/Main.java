import java.io.*;
import java.util.*;

import javax.imageio.metadata.IIOInvalidTreeException;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());

		int[] nums = new int[N];
		for(int i=0; i<N ;i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i <= N-K; i++) {
			Set<Integer> set = new HashSet<Integer>();
			for(int j=i; j<i+K; j++) {
				set.add(nums[j]);
			}
			bw.write(set.size()+" ");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}