import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class inf_06_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        System.out.print(solution(M, arr));
    }

    public static int solution(int target, int[] arr) {
        int answer = 0, start = 0, end = arr.length - 1;

        Arrays.sort(arr);

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                answer = mid + 1;
                break;
            }
            if (target > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
//        for (int i = 0; i < arr.length; i++) {
//            if (target == arr[i]) {
//                answer = i + 1;
//                break;
//            }
//        }

        return answer;
    }
}
