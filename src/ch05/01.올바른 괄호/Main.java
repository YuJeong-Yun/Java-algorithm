import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		Stack<Character> stack = new Stack<>();
		
		String result = "YES";
		for(char c : str.toCharArray()) {
			if(c == '(') {
				stack.push(c);
			}else {
				if(stack.size() == 0) {
					result = "NO";
					break;
				}else {
					stack.pop();
				}
			}
		}
		
		if(stack.size() != 0) {
			result = "NO";
		}

		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
	}
}