import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_2230 {
    public static int N;
    public static int M;
    public static int[] arr;
    public static int result = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        solution();
        System.out.println(result);
    }

    public static void solution() {
        int left = 0;
        int right = 0;

        while (right < N) {
            int min = arr[right] - arr[left];
            if (min == M) {
                result = M;
                break;
            } else if (min > M) {
                result = Math.min(result, min);
                left++;
            } else
                right++;
        }
    }
}
