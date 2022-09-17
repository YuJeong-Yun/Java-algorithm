import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		Stack<Integer> stack = new Stack<>();

		int rt, lt;
		for (Character x : str.toCharArray()) {
			if (Character.isDigit(x)) {
				stack.push((int)(x-'0'));
			} else if (x == '+') {
				rt = stack.pop();
				lt = stack.pop();
				stack.push(lt + rt);
			} else if (x == '-') {
				rt = stack.pop();
				lt = stack.pop();
				stack.push(lt - rt);
			} else if (x == '/') {
				rt = stack.pop();
				lt = stack.pop();
				stack.push(lt / rt);
			} else if (x == '*') {
				rt = stack.pop();
				lt = stack.pop();
				stack.push(lt * rt);
			}
		}

		bw.write(stack.get(0) + "");
		bw.flush();
		bw.close();
		br.close();
	}
}