import java.util.Scanner;

public class BJ_8393 {
	public static void main(String argc[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int result = 0;

		if (num < 1 || num > 10000) {
			System.out.printf("1이상 10,000이하의 자연수를 입력해주세요.");
			scan.close();
		}

		for (int i = num ; i > 0 ; i--) {
			result = result + i;
		}
		System.out.println(result);
	}
}
