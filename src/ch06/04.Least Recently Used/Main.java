import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());

		List<Integer> memory = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());

			if (memory.contains(num)) {
				memory.remove((Object)num);
			} else if (memory.size() == S) {
				memory.remove(S-1);
			}
			memory.add(0, num);
		}
		
		for(int i=0; i<memory.size(); i++) {
			bw.write(memory.get(i)+" ");
		}

		bw.flush();
		bw.close();
		br.close();
	}

}