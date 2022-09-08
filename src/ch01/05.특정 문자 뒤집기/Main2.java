import java.io.*;

public class Main2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		char[] strC = str.toCharArray();
		
		int lt=0, rt = strC.length - 1;
		
		while(lt < rt) {
			if(!Character.isAlphabetic(strC[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(strC[rt])) {
				rt--;
			}
			else {
				char tmp = strC[rt];
				strC[rt] = strC[lt];
				strC[lt] = tmp;
				lt++;
				rt--;
			}
		}
		
		str = String.valueOf(strC);
		bw.write(str);
		bw.flush();
		bw.close();
		br.close();
	}
}