import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inf_01_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine().toLowerCase();

        int lt = 0, rt = inputString.length() - 1;
        while (lt < rt) {
            if (inputString.charAt(lt) == inputString.charAt(rt)) {
                lt++;
                rt--;
            } else {
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
    }
}
