import java.io.*;

public class inf_1_2 {
	public String solution(String text) {
		String answer = "";

		for (char c : text.toCharArray()) {
//			if (Character.isLowerCase(c)) answer += Character.toUpperCase(c);
//			else if (Character.isUpperCase(c)) answer += Character.toLowerCase(c);
			if (c >= 'a' && c <= 'z') answer += (char)(c - 32);
			else if (c >= 'A' && c <= 'Z') answer += (char)(c + 32);
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		inf_1_2 inf = new inf_1_2();
		String text;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		text = br.readLine();
		bw.write(inf.solution(text));

		bw.flush();
		bw.close();
	}
}
