import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_01_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();

        String answer = "";

        while (inputString.length() > 0) {
            String target = String.valueOf(inputString.charAt(0));
            answer += target;
            inputString = inputString.replace(target, "");
        }

        System.out.println(answer);
    }

    public static String another(String inputString) {
        String answer = "";

        for (int i = 0; i < inputString.length(); i++) {
            char target = inputString.charAt(i);
            if (inputString.indexOf(target) == i)
                answer += target;
        }

        return answer;
    }
}
