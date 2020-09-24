import java.util.Scanner;

public class BJ_1330 {
	public static void main(String argc[]) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if (num1 > num2) 
			System.out.println(">");
		else if (num1 < num2)
			System.out.println("<");
		else
			System.out.printf("==");
	}
}
