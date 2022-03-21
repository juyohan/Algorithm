import java.util.Scanner;

public class BJ_1463 {
    static Integer cnt[];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        cnt = new Integer[N + 1]; // 각 Index 를 가기위해 최소 거리를 저장하기 위함.
        cnt[0] = cnt[1] = 0;
        System.out.println(solution(N));
    }

    public static int solution(int N) {

        if (cnt[N] == null) {
            if (N % 6 == 0) {
                cnt[N] = Math.min(solution(N - 1), Math.min(solution(N / 2), solution(N / 3))) + 1;
            } else if (N % 3 == 0) {
                cnt[N] = Math.min(solution(N / 3), solution(N - 1)) + 1;
            } else if (N % 2 == 0) {
                cnt[N] = Math.min(solution(N / 2), solution(N - 1)) + 1;
            } else {
                cnt[N] = solution(N - 1) + 1;
            }
        }

        return cnt[N];
    }
}
