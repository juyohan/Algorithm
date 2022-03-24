import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2003 {
    public static int N, M;
    public static int[] arr;
    public static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        solution();
        System.out.println(result);
    }

    public static void solution() {
        int lt = 0, rt = 0;

        while (rt < N) {
            int sum = 0;
            for (int i = lt ; i <= rt ; i++)
                sum += arr[i];
            if (sum == M) {
                result++;
                lt++;
            } else if (sum < M)
                rt++;
            else
                lt++;
        }
    }
}
