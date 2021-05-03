import java.io.*;

public class inf_1_1 {
	public int solution(String text, char find) {
		int answer = 0;

		text = text.toUpperCase();
		find = Character.toUpperCase(find);

//		for (int i = 0 ; i < text.length() ; i++) {
//			if (text.charAt(i) == find)
//				answer++;
//		}


		for (char x : text.toCharArray()) {
			if (x == find)
				answer++;
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		inf_1_1 inf = new inf_1_1();
		String text;
		char find;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		text = br.readLine();
		find = br.readLine().charAt(0);
		bw.write(String.valueOf(inf.solution(text, find)));

		bw.flush();
		bw.close();
	}
}
