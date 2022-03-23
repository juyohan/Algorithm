import java.util.Scanner;

public class BJ_1003 {
    public static int T, N;
    public static Integer[][] value;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        T = scan.nextInt();

        value = new Integer[41][2];
        value[0][0] = 1;
        value[0][1] = 0;
        value[1][0] = 0;
        value[1][1] = 1;

        for (int i = 0 ; i < T ; i++) {
            N = scan.nextInt();
            fibonacci(N);
            System.out.println(value[N][0] + " " + value[N][1]);
        }
    }

    public static Integer[] fibonacci(int n) {
        if (value[n][0] == null | value[n][1] == null) {
            value[n][0] = fibonacci(n - 1)[0] + fibonacci(n - 2)[0];
            value[n][1] = fibonacci(n - 1)[1] + fibonacci(n - 2)[1];
        }
        return value[n];
    }
}
