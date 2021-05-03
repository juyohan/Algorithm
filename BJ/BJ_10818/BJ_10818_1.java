import java.io.*;

public class BJ_10818_1 {
        public static void main(String argc[]) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
                int num = Integer.parseInt(br.readLine());
                if (num < 1 || num > 1000000) {
                        System.out.println("1이상 1,000,000이하의 정수를 입력해주세요.");
                        br.close();
                }
                String arr[] = br.readLine().split(" ");
                int max = -1000000;
                int min = 1000000;
                for (int i = 0 ; i < num; i++) {
                        if (max < Integer.parseInt(arr[i])) {
                                max = Integer.parseInt(arr[i]);
                        }
                        if (min > Integer.parseInt(arr[i])) {
                                min = Integer.parseInt(arr[i]);
                        }
                }
		bw.write(min + " " + max);
                bw.flush();
                bw.close();
        }
}
