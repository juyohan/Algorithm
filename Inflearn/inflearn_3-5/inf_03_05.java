import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_03_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i <= Math.ceil(N / 2); i++) {
            int start = i;
            int sum = 0;

            while (sum <= N) {
                sum += start++;
                if (sum == N) count++;
            }
        }
        System.out.println(count);
    }
}
