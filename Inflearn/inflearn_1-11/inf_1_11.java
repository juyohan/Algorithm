import java.io.*;
import java.lang.Math;

public class inf_1_11 {
	public String solution(String text) {
		String answer = "";
		int count = 1;

		for (int i = 0; i < text.length() - 1 ; i++) {
			if (text.charAt(i) == text.charAt(i+1)) {
				count++;
			}
			else {
				answer += text.charAt(i);
				if (count > 1)
					answer += count;
				count = 1;
			}
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		inf_1_11 inf = new inf_1_11();
		String text;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		text = br.readLine();

		bw.write(inf.solution(text + " "));

		bw.flush();
		bw.close();
	}
}
