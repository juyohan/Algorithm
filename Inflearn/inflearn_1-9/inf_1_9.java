import java.io.*;

public class inf_1_9 {

	public String solution(String text) {
		String answer = "";
		text = text.replaceAll("[^0-9]", "");

		if (text.charAt(0) == '0')
			text = text.replaceFirst("0", ""); // 첫번째 문자열만 변경

		return text;
	}

/*
	public String solution(String text) {
		int answer = 0;

		for (char c : text.toCharArray()) {
			if (c >= '0' && c <= '9') 
				answer = answer * 10 + (c-'0');
		}
		System.out.println(answer);
		return "";
	}
*/
/*
	public int solution(String text) {
		String answer = "";

		for (char c : text.toCharArray()) {
			if (Character.isDigit(c)) // .isDigit() : 해당 문자가 숫자인지 아닌지 판별
				answer += c;
		}
		return Integer.parseInt(answer);
	}
*/
	public static void main(String[] args) throws IOException {
		inf_1_9 inf = new inf_1_9();
		String text;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		text = br.readLine();

		if (text.length() > 100)
			bw.write("100자가 넘었습니다.");

		bw.write(inf.solution(text));

		bw.flush();
		bw.close();
	}
}
