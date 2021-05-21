import java.io.*;

public class inf_1_7 {
/*
	public String solution(String text) {
		String str = new StringBuilder(text).reverse().toString().toUpperCase();
		text = text.toUpperCase();

		return text.equals(str) ? "YES" : "NO";
	}
*/

	public String solution(String text) {
		char[] c = text.toUpperCase().toCharArray();
		int st = 0, fin = text.length() - 1;

		while (st < fin) {
			if (c[st] != c[fin])
				return "NO";
			st++;
			fin--;
		}
		return "YES";
	}

	public static void main(String[] args) throws IOException {
		inf_1_7 inf = new inf_1_7();
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
