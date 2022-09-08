import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		StringTokenizer A = new StringTokenizer(br.readLine());
		StringTokenizer B = new StringTokenizer(br.readLine());

		for(int i=0; i<N; i++) {
			int a = Integer.parseInt(A.nextToken());
			int b = Integer.parseInt(B.nextToken());
			String result = "";
			if(a - b == 1 || a - b == -2) {
				result = "A\n";
			}else if(a == b) {
				result = "D\n";
			}else {
				result = "B\n";
			}
			bw.write(result);
		}

		bw.flush();
		bw.close();
		br.close();
	}
}