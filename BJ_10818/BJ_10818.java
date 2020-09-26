import java.util.Scanner;

public class BJ_10818 {
	public static void main(String argc[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num < 1 || num > 1000000) {
			System.out.println("1이상 1,000,000이하의 정수를 입력해주세요.");
			scan.close();
		}
		int arr[] = new int[num];
		int max = -1000000;
		int min = 1000000;
		for (int i = 0 ; i < num; i++) {
		 	arr[i] = scan.nextInt();
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.printf(min + " " + max);
	}
}
