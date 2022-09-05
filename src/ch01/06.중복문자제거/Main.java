import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] check = new boolean[26];
		
		String input = br.readLine();
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			if(!check[c-97]) {
				bw.write(input.charAt(i));
				check[c-97] = true;
			}
		}
        
		bw.flush();
		bw.close();
		br.close();
	}
}