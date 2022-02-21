import java.util.Scanner;

public class BJ_8958 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for (int i = 0 ; i < N ; i++) {
            System.out.println(solution(scan.next()));
        }

    }

    public static int solution(String str) {
        int sum = 0, result = 0;

        for (int i = 0 ; i < str.length() ; i++) {
            switch (str.charAt(i)) {
                case 'O':
                    result += 1;
                    sum += result;
                    break;
                case 'X':
                    result = 0;
                    break;
            }
        }
        return sum;
    }
}
