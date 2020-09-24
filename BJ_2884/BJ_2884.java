import java.util.Scanner;

public class BJ_2884 {
	public static void main(String argc[]) {
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int minute = scan.nextInt();

		if (hour < 0 || hour > 23) {
			System.out.printf("0이상 23이하의 정수를 입력해주세요.");
			scan.close();
		}
		else if (minute < 0 || minute > 59) {
			System.out.printf("0이상 59이하의 정수를 입력해주세요.");
			scan.close();
		}

		if (minute >= 45)
			minute -= 45;
		else if (minute < 45) {
			hour -= 1;
			if (hour < 0)
				hour = 23;
			minute += 15;
		}
		System.out.printf(hour + " " + minute);
	}
}
