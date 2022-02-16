import java.util.Scanner;

public class BJ_11047 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        int[] arr = new int[N];

        for (int i = 0 ; i < N ; i++)
            arr[i] = scan.nextInt();

        System.out.println(solution(K, arr));
    }

    public static int solution(int K, int[] arr) {
        int result = 0;

        for (int i = arr.length - 1 ; i >= 0 ; i--) {
            if (K / arr[i] != 0) {
                result += (K / arr[i]);
                K %= arr[i];
            }
        }

        return result;
    }
}
