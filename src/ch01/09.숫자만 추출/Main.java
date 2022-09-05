import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<input.length(); i++){
			int c = input.charAt(i);
			if(c >= '0' && c <= '9' ) {
				sb.append((char)c);
			}
		}

		String result = sb.toString();
		
		bw.write(Integer.parseInt(result)+"");
		bw.flush();
		bw.close();
		br.close();
	}
}