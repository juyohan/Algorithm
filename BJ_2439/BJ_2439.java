import java.util.Scanner;

public class BJ_2439 {
        public static void main(String argc[]) {
                Scanner scan = new Scanner(System.in);
                int dst = scan.nextInt();
                if (dst < 1 || dst > 100) {
                        System.out.println("1보다 크고 100보다 작은 자연수를 입력해주세요.");
                        scan.close();
                }
                for (int i = 1; i <= dst ; i++) {
                        for (int j = 0; j < dst - i ; j++) {
                                System.out.printf(" ");
                        }
                        for (int k = dst - i ; k < dst ; k++) {
				System.out.printf("*");
			}
			System.out.println();
                }
        }
}
