import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_01_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();

        String numString = "";
        for (int i = 0; i < inputString.length(); i++) {
            if ('0' <= inputString.charAt(i) && inputString.charAt(i) <= '9')
                numString += inputString.charAt(i);
        }

        System.out.print(Integer.parseInt(numString));
    }
}
