import java.util.Scanner;

public class BJ_10950 {

        public static void main(String[] args) {

                int num1, num2, index;
		int[] result;
                Scanner scan = new Scanner(System.in);

		index = scan.nextInt();
		result = new int[index];

		for (int i = 0; i < index; i++) { 
                	num1 = scan.nextInt();
                	if (num1 > 0) {
                        	num2 = scan.nextInt();
                        	if (num2 < 10) {
                                	result[i] = num1 + num2;
                        	}
                        	else {
                                	System.out.println("두 번째 인수는 10보다 작아야합니다.");
                        	}
                	}
                	else {
                        	System.out.println("첫 인수는 0보다 커야합니다.");
                	}
		}
		for (int i = 0; i < index; i++) {
			System.out.println("A + B = " + result[i]);
		}
        }
}
