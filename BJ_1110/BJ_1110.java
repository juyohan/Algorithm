import java.util.Scanner;

public class BJ_1110 {
	public static void main (String argc[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num < 0 || num > 99) {
			System.out.println("0이상 99이하의 정수를 입력해주세요.");
		}
		int i = 1;
		int num1 = num;
		while (true) {
			int num2 = (num1 % 10) + (num1 / 10);
			int num3 = (num1 % 10) * 10 + (num2 % 10);
			if (num == num3)
				break;
			num1 = num3;
			i++;
		}
		System.out.println(i);
	}
}
