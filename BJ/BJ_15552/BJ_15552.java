import java.io.*;
import java.util.StringTokenizer;

public class BJ_15552 {
	public static void main(String argc[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int index = Integer.parseInt(br.readLine());
		if (index > 1000000) {
			System.out.println("1,000,000만 이하의 정수를 입력해주세요.");
			br.close();
		}
		int arr[] = new int[index];
		int i = 0;

		while(index > 0) {
			String str = br.readLine();

			StringTokenizer st = new StringTokenizer(str);
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			if ((num1 < 1 || num1 > 1000) || (num2 < 1 || num2 > 1000)) {
				System.out.println("두 정수는 1이상 1,000이하의 정수를 입력해주세요.");
				br.close();
			}
			arr[i] = num1 + num2;
			i++;
			index--;
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(i-- > 0) {
			bw.write(Integer.toString(arr[index]));
			index++;
			bw.newLine();
		}
		bw.flush();
	}
}
