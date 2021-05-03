import java.util.Scanner;

public class BJ_2741 {
	public static void main(String argc[]) {
		Scanner scan = new Scanner(System.in);
		int i = 1;
		int dst = scan.nextInt();
		if (dst > 100000) {
			System.out.println("100,000보다 작거나 같은 자연수를 입력해주세요.");
			scan.close();
		}
		while (i <= dst) {
			System.out.println(i++);
		}
	}
}
