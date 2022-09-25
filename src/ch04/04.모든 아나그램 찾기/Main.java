import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String S = br.readLine();
		String T = br.readLine();

		Map<Character, Integer> map = new HashMap<>();
		for (char c : T.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		int total = 0;
		for (int i = 0; i <= S.length() - T.length(); i++) {
			Map<Character, Integer> map2 = new HashMap<>(map);

			boolean check = true;
			for (int j = i; j < i + T.length(); j++) {
				char c = S.charAt(j);
				map2.put(c, map2.getOrDefault(c, 0) - 1);

				if (map2.get(c) < 0) {
					check = false;
					break;
				}
				if(map2.get(c) == 0) {
					map2.remove(c);
				}
				
			}
			if (check && map2.size() == 0) {
				total++;
			}
		}

		bw.write(total+"");
		bw.flush();
		bw.close();
		br.close();
	}
}