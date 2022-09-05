import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int pre = Integer.parseInt(st.nextToken());
		int temp = 0;
		bw.write(pre+" ");

		for(int i=0; i<N-1; i++) {
			temp = Integer.parseInt(st.nextToken());

			if(temp > pre) {
				bw.write(temp +" ");
			}
			pre = temp;
		}

		bw.flush();
		bw.close();
		br.close();
	}
}