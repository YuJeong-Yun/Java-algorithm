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
		
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<N; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		int result=0;
		for(int i=0; i<list.size(); i++) {
			result++;
			if(list.get(i) == M) {
				break;
			}
		}
		
		bw.write(result+"");
		
		bw.flush();
		bw.close();
		br.close();
	}

}