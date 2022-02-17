import java.util.Scanner;

public class BJ_1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int[] arr = new int[N];
        double max = 0;

        for (int i = 0 ; i < N ; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println(solution(arr, max, N));
    }

    public static double solution(int[] arr, double max, int N) {
        double sum = 0;

        for (int score : arr) {
            sum += (score / max) * 100;
        }

        return sum / N;
    }
}
