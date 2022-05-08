import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_01_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine().toLowerCase();
        int lt = 0, rt = inputString.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(inputString.charAt(lt)))
                lt++;
            else if (!Character.isAlphabetic(inputString.charAt(rt)))
                rt--;
            else if (inputString.charAt(lt) != inputString.charAt(rt)) {
                System.out.print("NO");
                return;
            } else if (inputString.charAt(lt) == inputString.charAt(rt)) {
                rt--;
                lt++;
            }
        }
        System.out.print("YES");
    }
}
