import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        System.out.println(solution(num));
    }

    public static int solution(String num) {
        char[] numArr = num.toCharArray();
        Arrays.sort(numArr);
        StringBuilder sb = new StringBuilder(String.valueOf(numArr));

        return Integer.parseInt(sb.reverse().toString());
    }
}
