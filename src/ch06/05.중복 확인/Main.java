import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		boolean[] check = new boolean[10000000];
		char result = 'U';
		for(int i=0; i<N; i++ ) {
			int num = Integer.parseInt(st.nextToken());
			if(check[num]) {
				result = 'D';
				break;
			}
			check[num] = true;
		}
		bw.write(result+"");
		bw.flush();
		bw.close();
		br.close();
	}

}