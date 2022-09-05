import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine() + "!";
		int seq = 1;
		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == input.charAt(i + 1)) {
				seq++;
			} else {
				if (seq == 1) {
					bw.write(input.charAt(i) + "");
				} else {
					bw.write(input.charAt(i) + "" + seq);
					seq = 1;
				}
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}