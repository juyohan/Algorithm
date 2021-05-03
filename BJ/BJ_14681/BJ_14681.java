import java.util.Scanner;

public class BJ_14681 {
	public static void main(String argc[]) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();

		if ((-1000 > x) && (x > 1000) && x == 0) {
			System.out.printf("-1000이상 1000이하 0이 아닌 정수를 입력해주세요.");
			scan.close();
		}
		else if ((-1000 > y) && (y > 1000) && y == 0) {
			System.out.printf("-1000이상 1000이하 0이 아닌 정수를 입력해주세요.");
			scan.close();
		}
		if (x > 0 && y > 0)
			System.out.printf("1");
		else if (x > 0 && y < 0)
			System.out.printf("4");
		else if (x < 0 && y > 0)
			System.out.printf("2");
		else
			System.out.printf("3");
	}
}
