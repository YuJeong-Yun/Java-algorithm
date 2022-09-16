import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());

		Set<Integer> set = new HashSet<>();
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(st1.nextToken());
			set.add(num);
		}
		
		List<Integer> commonNum = new ArrayList<>();
		for(int i=0; i<M; i++) {
			int num = Integer.parseInt(st2.nextToken());
			if(set.contains(num)) {
				commonNum.add(num);
			};
		}
		Collections.sort(commonNum);
		for(int i=0; i<commonNum.size(); i++) {
			bw.write(commonNum.get(i)+" ");
		}
		
		
		bw.flush();
		bw.close();
		br.close();
	}
}