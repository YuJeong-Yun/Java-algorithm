import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] height = new int[N];
		for (int i = 0; i < N; i++) {
			height[i] = Integer.parseInt(st.nextToken());
		}
		int p1 = 0, p2 = 0;
		for (int i = 0; i < N; i++) {
			if (height[i] > height[i + 1]) {
				p1 = i + 1;
				break;
			}
		}
		for (int i = p1 - 1; i > 0; i--) {
			if (height[i] == height[i - 1]) {
				p1 = i;
			}
			if(height[i] != height[i-1]) {
				break;
			}
		}

		for (int i = 1; i < N; i++) {
			if (height[i] < height[i - 1]) {
				p2 = i + 1;
			}
		}

		bw.write(p1 + " " + p2);
		bw.flush();
		bw.close();
		br.close();
	}

}