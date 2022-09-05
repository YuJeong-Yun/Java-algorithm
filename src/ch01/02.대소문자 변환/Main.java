import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for(char c : input.toCharArray()) {
			c = c >= 97 ? (char)(c-32) : (char)(c+32);
			sb.append(c);
		}
		
		System.out.println(sb);
		br.close();
	}
}