import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_02_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int target = 0, count = 0;

        for (int i = 0; i < N; i++) {
            int height = Integer.parseInt(st.nextToken());
            if (target < height) {
                count++;
                target = height;
            }
        }
        System.out.print(count);
    }
}
