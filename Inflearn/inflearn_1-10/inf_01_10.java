import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_01_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String S1 = st.nextToken();
        char c = st.nextToken().charAt(0);

        int[] arr = new int[S1.length()];

        int count = 1000;
        for (int i = 0; i < S1.length(); i++) {
            if (S1.charAt(i) == c)
                count = 0;
            else
                count++;
            arr[i] = count;
        }

        count = 1000;
        for (int i = S1.length() - 1; i >= 0; i--) {
            if (S1.charAt(i) == c)
                count = 0;
            else {
                count++;
                arr[i] = Math.min(arr[i], count);
            }
        }

        for (int k : arr)
            System.out.print(k + " ");
    }
}
