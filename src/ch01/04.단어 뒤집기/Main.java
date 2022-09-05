import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String word = br.readLine();
			
			for(int j=word.length()-1; j>=0; j--) {
				sb.append(word.charAt(j));
			}
			sb.append("\n");
		}

		System.out.println(sb);
		br.close();
	}
}