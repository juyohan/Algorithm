import java.util.Scanner;

public class BJ_10951 {

        public static void main(String[] args) {
		
		int buf[] = new int[1024];
		int i = 0;
                Scanner scan = new Scanner(System.in);
		while (scan.hasNextInt()) {
			int num1 = scan.nextInt();
			if (num1 < 0)
				break;
			int num2 = scan.nextInt();
			if (num2 > 10)
				break;
			buf[i] = num1 + num2;
			i++;
		}
		scan.close();
		for (int j = 0; j < i; j++) {
			System.out.println(buf[j]);
		}
	}
}
