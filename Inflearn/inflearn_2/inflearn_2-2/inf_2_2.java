import java.util.*;
import java.io.*;

public class inf_2_2 {
/*
	public int solution(int[] students, int num) {
		int answer = 1;
		int tmp = students[0];

		for (int i = 0 ; i < num - 1 ; i++) {	
			if (tmp < students[i+1]) { 
				answer += 1;
				tmp = students[i+1];
			}
		}

		return answer;
	}
*/
	public String solution(String[] str, int index) {
		int answer = 1;
		String tmp = str[0];

		for (int i = 0 ; i < index -1 ; i++) {
			if (Integer.parseInt(tmp) < Integer.parseInt(str[i+1])) {
				answer++;
				tmp = str[i+1];
			}
		}
		return Integer.toString(answer);
	}

	public static void main(String[] args) throws IOException {
		inf_2_2 inf = new inf_2_2();
		int num;
/*
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
*/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		num = br.readLine().charAt(0) - '0';
		String str = br.readLine();
		String[] students = str.split(" ");
/*
		for (int i = 0 ; i < num ; i++) 
			students[i] = scan.nextInt();
*/

		bw.write(inf.solution(students, num));

		bw.flush();
		bw.close();
	}
}
