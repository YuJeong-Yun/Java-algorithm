import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String word = br.readLine();
		char[] wordArr = new char[word.length()];
        List<Character> alphabet = new ArrayList<>();
      	List<Integer> alphabetIdx = new ArrayList<>();
      
      	for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
        	wordArr[i] = c;
        	if((c >= 'a' && c <='z') || (c >= 'A' && c <= 'Z')) {
            	alphabet.add(c);
            	alphabetIdx.add(i);
            }
        }
      
      	int cnt=0;
      	for(int i=alphabet.size()-1; i>=0; i--) {
        	wordArr[alphabetIdx.get(i)] = alphabet.get(cnt++);
        }
      
        for(int i=0; i<word.length(); i++) {
        	bw.write(wordArr[i]);
        }
        
		bw.flush();
		bw.close();
		br.close();
	}
}