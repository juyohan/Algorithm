import java.util.Scanner;

public class BJ_10430 {
	public static void main(String argc[]) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		System.out.printf((num1+num2)%num3 + "\n" + ((num1%num3)+(num2%num3))%num3 + "\n" + (num1*num2)%num3 + "\n" + ((num1%num3)*(num2%num3))%num3);
	}
}
