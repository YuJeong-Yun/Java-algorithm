import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();

		int[] alphabet = new int[N];
		for (char x : str.toCharArray()) {
			alphabet[x - 'A']++;
		}

		int max = Arrays.stream(alphabet).max().getAsInt();
		char result = 'A';
		for (int i = 0; i < 5; i++) {
			if (alphabet[i] == max) {
				result += i;
			}
		}

		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
	}
}