import java.io.*;

public class Main2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine().toLowerCase().replaceAll("[^a-z]", "");
		String result = "YES";
		
		int len = str.length();
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i) != str.charAt(len-1-i)) {
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