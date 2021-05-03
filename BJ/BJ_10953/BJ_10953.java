import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ_10953 {

        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int index = scan.nextInt();
		int arr[] = new int[index];
		while (scan.hasNext()) {
			String str = scan.next();
			StringTokenizer tokenizer = new StringTokenizer(str, ",");
			int num1 = Integer.parseInt(tokenizer.nextToken());
			int num2 = Integer.parseInt(tokenizer.nextToken());
			arr[i] = num1 + num2;
			i++;
			if (i == index)
				break;
		}
		for (int j = 0; j < i; j++) {
			System.out.println(arr[j]);
		}
        }
}
