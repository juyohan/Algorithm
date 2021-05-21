import java.io.*;
import java.lang.Math;

public class inf_1_10 {
/*
	public String solution(String text, char c) {
		char[] str = text.toCharArray();
		int length = 0, text_len = text.length() - 1;
		String answer = "";

		for (int i = 0 ; i < text.length() ; i++) {
			if (!(str[i] == c))
				length++;
			else
				length = 0;
			answer += length;			
		}
		int length1 = 0;
		String answer1 = "";

		for (int i = text_len ; i >= 0; i--) {
			if (!(str[i] == c))
				 length1++;
			else
				length1 = 0;
			answer1 += length1;
		}
		answer1 = new StringBuilder(answer1).reverse().toString();

		str = answer.toCharArray();
		char[] str1 = answer1.toCharArray();

		String result = "";

		for (int i = 0 ; i < text.length(); i++) {
			if (str[i] > str1[i])
				result = result + " " + str1[i];
			else
				result = result + " " + str[i];
		}

		return result;
	}
*/

	public int[] solution(String text, char c) {
		int[] answer = new int[text.length()];
		int length = 0;

		for (int i = 0 ; i < text.length() ; i++) {
			if (text.charAt(i) == c) {
				length = 0;
				answer[i] = length;
			}
			else {
				length++;
				answer[i] = length;
			}
		}

		length = 0;

		for (int i = text.length() - 1; i >= 0 ; i--) {
			if (text.charAt(i) == c) {
				length = 0;
/*
				if (answer[i] >= length) 
					answer[i] = length;
*/
//				answer[i] = Math.min(answer[i], length);
			}
			else {
				length++;
/*
				if (answer[i] >= length)
					answer[i] = length;
*/
				answer[i] = Math.min(answer[i], length);
			}
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		inf_1_10 inf = new inf_1_10();
		String text;
		char c;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		text = br.readLine();
		c = br.readLine().charAt(0);

		if (text.length() > 100)
			bw.write("100자가 넘었습니다.");

//		bw.write(inf.solution(text, c));

		for (int x : inf.solution(text, c))
			System.out.print(x + " ");

		bw.flush();
		bw.close();
	}
}
