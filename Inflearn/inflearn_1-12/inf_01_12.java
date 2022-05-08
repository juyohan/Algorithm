import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_01_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int charCount = Integer.parseInt(br.readLine());
        String signal = br.readLine();

        for (int i = 0; i < charCount; i++) {
            String signalBit = signal.substring(0, 7);
            StringBuilder sb = new StringBuilder(signalBit);
            String reverseSignal = sb.reverse().toString();
            signal = signal.substring(7);

            int charNum = 0;
            for (int k = 0; k < reverseSignal.length(); k++) {
                if (reverseSignal.charAt(k) == '#')
                    charNum += Math.pow(2, k);
            }
            System.out.print((char) charNum);
        }
    }
}
