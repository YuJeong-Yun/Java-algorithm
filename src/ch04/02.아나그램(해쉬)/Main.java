import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String w1 = br.readLine(), w2 = br.readLine();
		int[] alphabet = new int[58];
		
		for(int i=0; i<w1.length(); i++) {
			alphabet[w1.charAt(i)-'A']++;
		}
		
		for(int i=0; i<w2.length(); i++) {
			alphabet[w2.charAt(i)-'A']--;
		}

		String result = "YES";
		for(int i=0; i<alphabet.length; i++) {
			if(alphabet[i] != 0) {
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