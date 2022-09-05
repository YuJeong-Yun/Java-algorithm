import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input =  new String(br.readLine()).toUpperCase();
		char alphabet = (char) br.read();
		alphabet = alphabet > 'a' ? (char)(alphabet - 32) : alphabet;
		
		int cnt = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == alphabet) {
				cnt++;
			}
		}

		bw.write(cnt + "");

		bw.flush();
		bw.close();
		br.close();
	}
}