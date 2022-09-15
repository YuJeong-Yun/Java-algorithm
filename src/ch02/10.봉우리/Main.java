import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[][] map = new int[N + 2][N + 2];
		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int cnt=0;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if(map[i][j] <= map[i][j-1]) {
					continue;
				}
				if(map[i][j] <= map[i][j+1]) {
					continue;
				}
				if(map[i][j] <= map[i-1][j]) {
					continue;
				}
				if(map[i][j] <= map[i+1][j]) {
					continue;
				}
				cnt++;
			}
		}

		bw.write(cnt+"");
		bw.flush();
		bw.close();
		br.close();
	}
}