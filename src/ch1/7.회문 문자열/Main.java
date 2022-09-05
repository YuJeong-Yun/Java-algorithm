import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine().toLowerCase();
		int cnt = input.length() - 1;
		String result = "YES";
		for(int i=0; i<input.length() / 2; i++) {
			if(input.charAt(i) != input.charAt(cnt--) ) {
				result = "NO";
				break;
			}
		}

		bw.write(result);

		bw.flush();
		bw.close();
		br.close();
	}
}