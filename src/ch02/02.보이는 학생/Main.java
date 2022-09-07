import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] students = new int[N];
		for (int i = 0; i < N; i++) {
			students[i] = Integer.parseInt(st.nextToken());
		}

		int answer = 1, max = students[0];
		for (int i = 1; i < N; i++) {
			if (students[i] > max) {
				answer++;
				max = students[i];
			}
		}

		bw.write(answer + "");
		bw.flush();
		bw.close();
		br.close();
	}
}