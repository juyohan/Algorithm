import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class inf_06_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < N ; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        System.out.print(solution(M, arr));
    }

    public static int solution(int M, int[] arr) {
        int answer = 0, max = Arrays.stream(arr).max().getAsInt(), sum = Arrays.stream(arr).sum();

        while (max <= sum) {
            int mid = (max + sum) / 2;

            if (count(arr, mid) < M) {
                answer = mid;
                sum = mid - 1;
            } else
                max = mid + 1;
        }
        return answer;
    }

    public static int count(int[] arr, int mid) {
        int count = 0, sum = 0;
        for (int value : arr) {
            if (sum + value > mid) {
                count++;
                sum = value;
            } else sum += value;
        }
        return count;
    }
}
