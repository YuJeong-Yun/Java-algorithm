import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int cnt = 0;
		for (int i = 2; i <= N; i++) {
			boolean check = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if(i%j == 0) {
					check=false;
					break;
				}
			}
			if(check) {
				cnt++;
			}
		}

		bw.write(cnt + "");
		bw.flush();
		bw.close();
		br.close();

	}
}