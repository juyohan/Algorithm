import java.io.*;

public class inf_1_5 {
	public String solution(String text) {
		char[] answer = text.toCharArray();
		int st = 0, lt = text.length() - 1;

		while (st < lt) {
/*			if ((answer[st] >= 'a' && answer[st] <= 'z') || (answer[st] >= 'A' && answer[st] <= 'Z')) {
				char tmp = answer[st];
				if ((answer[lt] >= 'A' && answer[lt] <= 'Z') || (answer[lt] >= 'a' && answer[lt] <= 'z')) {
					answer[st] = answer[lt];
					answer[lt] = tmp;
				}
			}
			st++;
			lt--;
*/
			if (!(Character.isAlphabetic(answer[st])))
				st++;
			else if (!(Character.isAlphabetic(answer[lt])))
				lt--;
			else {
				char tmp = answer[st];
				answer[st] = answer[lt];
				answer[lt] = tmp;
				st++;
				lt--;
			}
		}

		return String.valueOf(answer);
	}

	public static void main(String[] args) throws IOException {
		inf_1_5 inf = new inf_1_5();
		String text;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		text = br.readLine();

		if (text.length() > 100) 
			bw.write("100자를 넘겼습니다.");
 
		bw.write(inf.solution(text));

		bw.flush();
		bw.close();
	}
}
