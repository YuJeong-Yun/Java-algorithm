import java.io.*;
import java.util.*;

public class Main2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		String s = st.nextToken();
		char t = st.nextToken().charAt(0);

		int p = 1000;
		int[] dist = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == t) {
				p = 0;
			} else {
				p++;
			}
			dist[i] = p;
		}

		p = 1000;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == t) {
				p = 0;
			} else {
				p++;
			}
			dist[i] = Math.min(dist[i], p);
		}

		for (int i = 0; i < dist.length; i++) {
			bw.write(dist[i] + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}