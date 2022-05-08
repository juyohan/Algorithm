import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_01_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();
        String[] splitString = inputString.split(" ");

        int max = -1, idx = 0;
        for (int i = 0; i < splitString.length; i++) {
            String target = splitString[i];
            if (max < target.length()) {
                max = target.length();
                idx = i;
            }
        }

        System.out.print(splitString[idx]);
    }
}
