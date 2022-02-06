import java.util.Scanner;

public class BJ_11720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String value = scan.next();

        if (size == value.length())
            solution(value);
    }

    public static void solution(String value) {
        int result = 0;

        for (char c : value.toCharArray()) {
            result += Integer.parseInt(String.valueOf(c));
        }

        System.out.println(result);
    }
}
