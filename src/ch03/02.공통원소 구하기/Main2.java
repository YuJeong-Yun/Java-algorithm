import java.io.*;
import java.util.*;

public class Main2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());

		int[] arr1 = new int[N];
		for (int i = 0; i < N; i++) {
			arr1[i] = Integer.parseInt(st1.nextToken());
		}
		int[] arr2 = new int[M];
		for (int i = 0; i < M; i++) {
			arr2[i] = Integer.parseInt(st2.nextToken());
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int p1 = 0, p2 = 0;
		List<Integer> common = new ArrayList<>();
		while (p1 < N && p2 < M) {
			if (arr1[p1] == arr2[p2]) {
				common.add(arr1[p1++]);
				p2++;
			}else if(arr1[p1] < arr2[p2]){
				p1++;
			}else {
				p2++;
			}
		}
		
		for(int i=0; i<common.size(); i++) {
			bw.write(common.get(i)+" ");
		}

		bw.flush();
		bw.close();
		br.close();
	}

}
