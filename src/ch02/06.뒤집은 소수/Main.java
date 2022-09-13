import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		out: for (int i = 0; i < N; i++) {
			String numS = st.nextToken();
			int num = Integer.parseInt(new StringBuilder(numS).reverse().toString());
			if (num == 1) {
				continue;
			}
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					continue out;
				}
			}
			bw.write(num + " ");
		}

		bw.flush();
		bw.close();
		br.close();

	}
}