import java.io.*;
import java.util.*;
import java.lang.Math;

public class inf_1_12 {
	public String solution(int index, String text) {
		List<String> strs = new ArrayList<>();
		String answer = "";

		for (char c : text.toCharArray()) {
			if (c == '#')
				c = '1';
			else if (c == '*')
				c = '0';
			answer += c;
		}

		for (int i = 0 ; i < index ; i++) {
			strs.add(answer.substring(0, 7));
			answer = answer.substring(7, answer.length());
		}

		for (String str : strs) {
			char[] c = new StringBuilder(str).reverse().toString().toCharArray();
			int num = 0;
			for (int i = 6 ; i >=0  ; i--) {
				if (c[i] == '1')
					num += Math.pow(2,i);
			}
			answer += (char)num;
		}

		return answer.toUpperCase();
	}

	public static void main(String[] args) throws IOException {
		inf_1_12 inf = new inf_1_12();
		String text;
		int index;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		index = Integer.parseInt(br.readLine());
		text = br.readLine();

		bw.write(inf.solution(index ,text));

		bw.flush();
		bw.close();
	}
}
