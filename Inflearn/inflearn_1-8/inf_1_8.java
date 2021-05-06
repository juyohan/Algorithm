import java.io.*;

public class inf_1_8 {
	public String solution(String text) {
//		String str = new StringBuilder(text).reverse().toString().toUpperCase().replaceAll("[^A-Z]","");
		text = text.toUpperCase().replaceAll("[^A-Z]", "");
		String str = new StringBuilder(text).reverse().toString();

		return text.equals(str) ? "YES" : "NO";
	}

	public static void main(String[] args) throws IOException {
		inf_1_8 inf = new inf_1_8();
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
