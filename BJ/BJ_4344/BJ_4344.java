import java.util.Arrays;
import java.util.Scanner;

public class BJ_4344 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int C = scan.nextInt();

        for (int i = 0 ; i < C ; i++) {
            int N = scan.nextInt();
            int[] arr = new int[N];
            for (int j = 0 ; j < N ; j++)
                arr[j] = scan.nextInt();
            System.out.println(String.format("%.3f",solution(arr)) + "%");
        }
    }

    public static double solution(int[] arr) {
        double sum = 0;
        double avg = Arrays.stream(arr).average().getAsDouble();
        for (int score : arr) {
            if (score > avg)
                sum += 1;
        }
        return sum / arr.length * 100;
    }
}
