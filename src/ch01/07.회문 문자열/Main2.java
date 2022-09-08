import java.io.*;

public class Main2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		String strRe = new StringBuilder(str).reverse().toString();
		String answer ="NO";
		
		if(str.equalsIgnoreCase(strRe)) {
			answer = "YES";
		}
		
		bw.write(answer);
		bw.flush();
		bw.close();
		br.close();
	}
}