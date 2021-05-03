import java.util.Scanner;

public class BJ_11021 {

        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int i = 0;
                int index = scan.nextInt();
                int arr[] = new int[index];
                while (scan.hasNextInt()) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
                        arr[i] = num1 + num2;
                        i++;
                        if (i == index)
                                break;
                }
                for (int j = 0; j < i; j++) {
			int k = j + 1;
                        System.out.println("Case #" + k + ": " + arr[j]);
                }
        }
}
