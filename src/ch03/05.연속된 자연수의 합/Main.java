import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int p1 = 1, p2 = 2, temp = 3, cnt = 0;
		while (p2 < N) {
			if(temp == N) {
				temp -= p1++;
				cnt++;
			}
			else if(temp > N) {
				temp -= p1++; 
			}else {
				temp += ++p2;
			}
		}

		bw.write(cnt+"");
		bw.flush();
		bw.close();
		br.close();
	}
}