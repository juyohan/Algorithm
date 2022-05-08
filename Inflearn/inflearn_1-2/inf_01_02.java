import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_01_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();
        char[] stringArr = inputString.toCharArray();

        String answer = "";
        for (int i = 0; i < stringArr.length; i++) {
            char target = stringArr[i];
            if ('a' <= target && 'z' >= target)
                answer += (char) ('A' + (target - 'a'));
            else if ('A' <= target && 'Z' >= target)
                answer += (char) ('a' + (target - 'A'));
        }
        System.out.print(answer);
    }
}
