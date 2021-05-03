import java.util.Scanner;

public class BJ_2739 {
	public static void main(String argc[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i = 0;

		while (i++ < 9)
			System.out.println(num + " * " + i + " = " + num*i);
	}
}
