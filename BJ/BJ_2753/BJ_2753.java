import java.util.Scanner;

public class BJ_2753 {
	public static void main(String argc[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num < 1 || num > 4000)
			System.out.println("1이상 4000이하의 정수를 입력해주세요.");
		if ((num % 4 == 0) && ((num % 100 != 0) || (num % 400 == 0))) {
			System.out.printf("1");
		}
		else
			System.out.printf("0");
	}
}
