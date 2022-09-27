import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		Stack<Character> stack = new Stack<>();
		
		for(char c : str.toCharArray()) {
			if(c == '(') {
				stack.push(c);
			}else if(c == ')') {
					stack.pop();
			}else {
				if(stack.size() == 0) {
					bw.write(c+"");
				}
			}
		}
		
		
		bw.flush();
		bw.close();
		br.close();
	}
}