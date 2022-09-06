import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		String first = "";
		while (st.hasMoreTokens()) {
			String str = st.nextToken();
			
			if(str.length() > first.length()) {
				first = str;
			}
		}
		
		bw.write(first);

		bw.flush();
		bw.close();
		br.close();
	}
}