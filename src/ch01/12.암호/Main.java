import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		boolean[] signal = new boolean[7*N];

		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == '#') {
				signal[i] = true;
			}
		}

		for(int i=0; i<N; i++) {
			int c = 0;
			for(int j=i*7; j<(i+1)*7; j++) {
				if(signal[j]) {
					c += Math.pow(2, 6-j%7);
				}
			}
			bw.write((char)c+"");

		}

		bw.flush();
		bw.close();
		br.close();
	}
}