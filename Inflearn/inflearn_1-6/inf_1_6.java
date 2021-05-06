import java.io.*;

public class inf_1_6 {
	public String solution(String text) {
		String answer = "";

		for (int i = 0 ; i < text.length() ; i++) {
			// text.indexOf() : text에서 ()안에 있는 문자가 처음으로 발견된 index의 값을 반환
			// text.charAt() : text에서 ()안에 있는 번째의 문자를 반환

			// text.indexOf(text.charAt()) : text에서 text.charAt() : text에서 ()번째의 문자를 반환한 뒤 문자가 처음 발견된 index의 값을 반환해준다. 
			if (i == text.indexOf(text.charAt(i)))
				answer += text.charAt(i);
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		inf_1_6 inf = new inf_1_6();
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
