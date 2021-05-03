import java.util.Scanner;

public class BJ_2562_1 {
        public static void main(String argc[]) {
            Scanner scan = new Scanner(System.in);
            int num[] = new int[9];
            int max = 0;
	    int k = 0;
            for (int i = 0 ; i < 10; i++) { 
                num[i] = scan.nextInt();
                if (max < num[i]) {
                    max = num[i];
			k++;
                }
            }
            System.out.println(max + "\n" + k);
        }
}
