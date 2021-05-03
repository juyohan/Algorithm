import java.util.Scanner;

public class BJ_10871 {
        public static void main(String argc[]) {
                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();
		int com = scan.nextInt();
		if (n < 1 || com > 10000) {
			System.out.println("1이상과 10,000이하의 정수를 입력해주세요.");
		}
		int arr[] = new int[n];
		for (int i = 0 ; i < n ; i++) {
			arr[i] = scan.nextInt();
			if (arr[i] < com) {
				System.out.printf(arr[i] + " ");
			}
		}
	}
}
