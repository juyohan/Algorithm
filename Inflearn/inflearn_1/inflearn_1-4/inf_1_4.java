import java.io.*;
import java.util.*;

public class inf_1_4 {
/*	public ArrayList<String> solution(int index, String[] text) {
		ArrayList<String> strs = new ArrayList<>();

		for (String str : text) {
			String tmp = new StringBuilder(str).reverse().toString();
			strs.add(tmp);
		}

		return strs;
	}
*/

/*	public String solution(String text) {
		char[] c = text.toCharArray();
		String answer = "";

		for (int i = text.length() - 1 ; i >= 0 ; i--)
			answer += c[i];

		return answer;
	}
*/

	public ArrayList<String> solution(String[] text) {
		ArrayList<String> strs = new ArrayList<>();

		for (String str : text) {
			char[] c = str.toCharArray(); // 문자열을 배열로
			int st = 0;
			int lt = str.length() - 1;
			while (st < lt) {
				char tmp = c[st];
				c[st] = c[lt];
				c[lt] = tmp;
				st++;
				lt--;
			}
			String tmp = String.valueOf(c); // 배열 -> 문자열로 변환
			strs.add(tmp);
		}

		return strs;
	}

	public static void main(String[] args) throws IOException {
		inf_1_4 inf = new inf_1_4();
		String[] text;
		int index;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		index = Integer.parseInt(br.readLine());
		text = new String[index];

		if (index > 20 || index < 3)
			System.out.println("3~20 사이의 수를 입력해주세요.");

/*		for (int i = 0 ; i < index ; i++) {	
			text[i] = br.readLine();
			bw.write(inf.solution(text[i])+"\n");
		}
*/

		for (int i = 0 ; i < index ; i++) 
			text[i] = br.readLine();

//		for (String str : inf.solution(index, text))
//			bw.write(str);

		for (String str : inf.solution(text))
			bw.write(str + "\n");

		bw.flush();
		bw.close();
	}
}
