import java.util.Scanner;

public class BJ_2588 {
	public static void main(String argc[]) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int buf;
		int result = num2;
		while(num2 > 0) {
			buf = num2 % 10;
			num2 = num2 / 10;
			System.out.println(num1 * buf);
		}
		System.out.println(num1 * result);
	}
}
