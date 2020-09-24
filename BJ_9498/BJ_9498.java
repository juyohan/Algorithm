import java.util.Scanner;

public class BJ_9498 {
	public static void main(String argc[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt() / 10;
		switch(num) {
			case 10:
				System.out.println("A");
				break;
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default :
				System.out.println("F");
				break;
		}
	}
}
