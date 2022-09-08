import java.io.*;

public class Main2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		
		for(int i=0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i))==i) {
				bw.write(str.charAt(i));
			}
		}
		
		
		bw.flush();
		bw.close();
		br.close();
	}
}