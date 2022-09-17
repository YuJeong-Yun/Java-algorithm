import java.io.*;
import java.util.*;

public class Main {
	public static void charge() {

	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[][] applicant = new int[N][2];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			applicant[i][0] = Integer.parseInt(st.nextToken());
			applicant[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int cnt=0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(applicant[i][0] < applicant[j][0] && applicant[i][1] < applicant[j][1]) {
					cnt++;
					break;
				}
			}
		}
		
		bw.write(N-cnt+"");
		bw.flush();
		bw.close();
		br.close();
	}
}