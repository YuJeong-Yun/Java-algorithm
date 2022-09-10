import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[] fibo = new int[N];
		fibo[0] = fibo[1] = 1; 

		for(int i=2; i<N; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}

		for(int i=0; i<N; i++) {
			bw.write(fibo[i] + " ");
		}

		bw.flush();
		bw.close();
		br.close();

	}
}