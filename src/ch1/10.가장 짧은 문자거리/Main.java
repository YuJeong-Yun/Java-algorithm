import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		String s = st.nextToken();
		char t = st.nextToken().charAt(0);

		List<Integer> tIdx = new ArrayList<>();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == t) {
				tIdx.add(i);
			}
		}

		int[] dist = new int[s.length()];
		for(int i=0; i<s.length(); i++) {
			dist[i] = 100;
			for(int j=0; j<tIdx.size(); j++) {
				if(i == tIdx.get(j)) {
					dist[i] = 0;
					break;
				}
				dist[i] = Math.min(dist[i], Math.abs(tIdx.get(j) - i));
			}
		}

		for(int i=0; i<dist.length; i++) {
			bw.write(dist[i]+" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}