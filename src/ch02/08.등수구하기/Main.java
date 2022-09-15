import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] scores = new int[N];
		int[] scoresSort = new int[N];
		Map<Integer, Integer> rank = new HashMap<>();
		for(int i=0; i<N; i++) {
			scores[i] = scoresSort[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(scoresSort);
		
		for(int i=0; i<N; i++) {
			rank.put(scoresSort[i], N-i);
		}
		
		for(int i=0; i<N;i ++) {
			bw.write(rank.get(scores[i])+" ");
		}
		
		
		
		bw.flush();
		bw.close();
		br.close();
	}
}