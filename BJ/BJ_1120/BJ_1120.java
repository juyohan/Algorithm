import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1120 {
    public static String A, B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = st.nextToken();
        B = st.nextToken();

        System.out.println(solution());
    }

    public static int solution() {
        int result = A.length();

        for (int i = 0; i <= B.length() - A.length(); i++) {
            int cnt = 0;

            for (int j = 0; j < A.length(); j++)
                if (A.charAt(j) != B.charAt(i + j)) cnt++;

            result = Math.min(result, cnt);
        }
        return result;
    }
}
