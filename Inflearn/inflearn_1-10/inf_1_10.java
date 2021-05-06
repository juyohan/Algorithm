import java.io.*;

public class inf_1_10 {
	public String solution(String text, char c) {
		char[] str = text.toCharArray();
		int length = 0, text_len = text.length() - 1;
		String answer ;

		for (int i = 0 ; i < text.length() ; i++) {
			if (!(str[i] == c))
				length++;
			else
				length = 0;
			
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

		bw.write(inf.solution(text, c));

		bw.flush();
		bw.close();
	}
}
