import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());

		int limit = 1000000;

		boolean[] check = new boolean[limit];
		for (int i = 0; i < N; i++) {
			check[Integer.parseInt(st.nextToken())] = true;
		}

		int result = 0;
		for (int i = 0; i <= M; i++) {
			if (check[i]) {
				result++;
			}
		}

		bw.write(result + "");

		bw.flush();
		bw.close();
		br.close();
	}

}