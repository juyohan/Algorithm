import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_03_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int count = 0, lt = 0, rt = 0, sum = 0;

        while (rt < N) {
            if (sum <= M) {
                sum += arr[rt++];
                if (sum == M) count++;
            }
            if (sum > M) {
                sum -= arr[lt++];
                if (sum == M) count++;
            }
        }
        System.out.print(count);
    }
}
