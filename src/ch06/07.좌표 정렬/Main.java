import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		Map<Integer, List<Integer>> map = new HashMap<>();
		Set<Integer> seq= new HashSet<>();
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			seq.add(x);
			List<Integer> list = map.getOrDefault(x, new ArrayList<Integer>());
			list.add(y);
			map.put(x,  list);
		}
		
		List<Integer> seqList = new ArrayList<>(seq);
		Collections.sort(seqList);
		for(int i=0; i<seqList.size(); i++) {
			List<Integer> list = map.get(seqList.get(i));
			Collections.sort(list);
			for(int j=0; j<list.size(); j++) {
				bw.write(seqList.get(i)+" "+list.get(j)+"\n");
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}

}