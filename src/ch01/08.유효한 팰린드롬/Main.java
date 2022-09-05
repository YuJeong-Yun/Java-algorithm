import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine().toLowerCase();
		List<Character> alphabet = new ArrayList<>();

		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			if(c >= 'a' && c <= 'z') {
				alphabet.add(c);
			}
		}

		int cnt = alphabet.size()-1;
		String result = "YES";
		for(int i=0; i<alphabet.size()/2; i++) {
			if(alphabet.get(i) != alphabet.get(cnt--)) {
				result = "NO";
			}
		}

		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
	}
}