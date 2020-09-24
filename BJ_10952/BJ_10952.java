import java.util.Scanner;

public class BJ_10952 {

        public static void main(String[] args) {

                int num1, num2;
		int i = 0;
		int buf[] = new int[1024];
                Scanner scan = new Scanner(System.in);

		while(i < 1024) {
                	num1 = scan.nextInt();
                	if (num1 >= 0) {
                        	num2 = scan.nextInt();
				if (num2 == 0) {
					break;
				}
				else if (num1 == 0 && (num2 <10 && num2 != 0)) {
					System.out.println("첫 인수는 0보다 커야합니다.");
				}
                        	else if (num1 != 0 && (num2 < 10 && num2 != 0)) {
                                	buf[i] = num1 + num2;
					i++;
                       		}
                        	else {
                                	System.out.println("두 번째 인수는 10보다 작아야합니다.");
                        	}
                	}
                	else {
                        	System.out.println("첫 인수는 0보다 커야합니다.");
                	}
		}
		for (int j = 0; j < i; j++) {
			System.out.println(buf[j]);
		}
        }
}
