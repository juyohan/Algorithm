import java.util.Scanner;

public class BJ_1000 {

	public static void main(String[] args) {

		int num1, num2, num3;
		Scanner scan = new Scanner(System.in);
		
		num1 = scan.nextInt();
		if (num1 > 0) {
			num2 = scan.nextInt();
			if (num2 < 10) {
				num3 = num1 + num2;
				System.out.println("A + B = " + num3);
			}
			else {
				System.out.println("두 번째 인수는 10보다 작아야합니다.");
			}
		}
		else {
			System.out.println("첫 인수는 0보다 커야합니다.");
		}
	}
}
