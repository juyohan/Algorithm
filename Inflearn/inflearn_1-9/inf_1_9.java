import java.io.*;

public class inf_1_9 {
	public String solution(String text) {
		String answer = "";
		text = text.replaceAll("[^0-9]", "");

		if (String.valueOf(text.charAt(0)).equals("0"))
			text = text.replaceFirst("0", "");

		return text;
	}

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
