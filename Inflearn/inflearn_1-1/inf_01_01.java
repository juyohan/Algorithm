import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_01_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine().toLowerCase();
        String targetChar = br.readLine().toLowerCase();

        char[] stringArr = string.toCharArray();
        int answer = 0;
        for (int i = 0; i < stringArr.length; i++)
            if (stringArr[i] == targetChar.charAt(0))
                answer++;

        System.out.print(answer);
    }
}
