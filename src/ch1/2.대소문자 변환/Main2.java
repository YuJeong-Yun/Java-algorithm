import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) >= 97) {
				sb.append((char)(input.charAt(i)-32));
			}else {
				sb.append((char)(input.charAt(i)+32));
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}