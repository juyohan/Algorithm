import java.io.*;

public class inf_1_3 {
	public String solution(String text1) {
		String answer = "";

//		for (String str : text1.split(" ")) {
//			if (str.length() > answer.length())
//				answer = str;
//		}

		while(text1.indexOf(' ') != -1) {
			if (text1.indexOf(' ') > answer.length())
				answer = text1.substring(0, text1.indexOf(' ')); 
			text1 = text1.substring(text1.indexOf(' ') + 1);
		}

		return answer.length() > text1.length() ? answer : text1;
	}

	public static void main(String[] args) throws IOException {
		inf_1_3 inf = new inf_1_3();
		String text1;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		text1 = br.readLine();

		if (text1.length() <= 100)
			bw.write(inf.solution(text1));
		else
			bw.write("100자가 넘었습니다.");

		bw.flush();
		bw.close();
	}
}
