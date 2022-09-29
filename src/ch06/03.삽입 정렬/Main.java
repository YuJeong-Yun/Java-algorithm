import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());

			boolean check = false;
			for (int j = 0; j < list.size(); j++) {
				if (num < list.get(j)) {
					list.add(j, num);
					check = true;
					break;
				}
			}
			if (!check) {
				list.add(num);
			}
		}

		for (int i = 0; i < N; i++) {
			bw.write(list.get(i) + " ");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}