import java.io.*;
import java.util.*;
import java.lang.Math;

public class inf_1_12 {
	public String solution(int index, String text) {
		String answer = "";

		for (int i = 0; i < index ; i++) {
			String tmp = text.substring(0,7).replace('#', '1').replace('*', '0');
			text = text.substring(7);
			int num = Integer.parseInt(tmp, 2);

			answer += (char)num;
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		inf_1_12 inf = new inf_1_12();
		String text;
		int index;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		index = Integer.parseInt(br.readLine());
		text = br.readLine();

		bw.write(inf.solution(index ,text));

		bw.flush();
		bw.close();
	}
}
