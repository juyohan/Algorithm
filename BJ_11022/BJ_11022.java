import java.util.Scanner;

public class BJ_11022 {

        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int i = 0;
                int index = scan.nextInt();
                int arr[] = new int[index];
		int num1[] = new int[index];
		int num2[] = new int[index];
                while (scan.hasNextInt()) {
                        num1[i] = scan.nextInt();
                        num2[i] = scan.nextInt();
                        arr[i] = num1[i] + num2[i];
                        i++;
                        if (i == index)
                                break;
                }
		for (int j = 0; j < i ; j++) {
			int k = j + 1;
			System.out.println("Case #" + k + ": " + num1[j] + " + " + num2[j] + " = " + arr[j]);
		}
        }
}
