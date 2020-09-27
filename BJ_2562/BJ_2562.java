import java.io.*;

public class BJ_2562 {
	public static void main(String argc[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int min = 0;
		int max = 100;
		String[9] arr = br.readLine();
		for (int i = 0 ; i < 10 ; i++) {
			bw.write(arr[i]);
		}
		bw.flush();
		bw.close();
	}
}
