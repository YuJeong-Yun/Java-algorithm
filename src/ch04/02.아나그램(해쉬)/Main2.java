import java.io.*;
import java.util.*;

public class Main2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s1 = br.readLine();
		String s2 = br.readLine();

		Map<Character, Integer> map = new HashMap<>();
		for (char x : s1.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}

		String result = "YES";
		for (int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			if (!map.containsKey(c) || map.get(c) == 0) {
				result = "NO";
				break;
			}
			map.put(c, map.get(c)-1);
		}

		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
	}

}
