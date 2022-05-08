import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_01_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();

        System.out.println(another(inputString));

        String alphaString = "";

        for (int i = 0; i < inputString.length(); i++) {
            char target = inputString.charAt(i);
            if ('a' <= target && target <= 'z' || 'A' <= target && target <= 'Z')
                alphaString += target;
        }

        StringBuilder sb = new StringBuilder(alphaString);
        String reverseString = sb.reverse().toString();

        char[] stringArr = inputString.toCharArray(); // Ex) a#bc$
        char[] reverseArr = reverseString.toCharArray(); // Ex) cba

        String answer = "";
        int idx = 0;

        for (int i = 0; i < stringArr.length; i++) {
            char target = stringArr[i];
            if ('a' <= target && target <= 'z' || 'A' <= target && target <= 'Z')
                answer += reverseArr[idx++];
            else
                answer += target;
        }

        System.out.print(answer);
    }

    public static String another(String inputString) {
        char[] stringArr = inputString.toCharArray();
        int lt = 0, rt = stringArr.length - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(stringArr[lt]))
                lt++;
            else if (!Character.isAlphabetic(stringArr[rt]))
                rt--;
            else {
                char temp = stringArr[lt];
                stringArr[lt] = stringArr[rt];
                stringArr[rt] = temp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(stringArr);
    }
}
