import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ_10773 {
    public static int K;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        K = Integer.parseInt(st.nextToken());

        arr = new int[K];
        for (int i = 0; i < K; i++)
            arr[i] = Integer.parseInt(br.readLine());

        System.out.println(solution());
    }

    public static int solution() {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (int num : arr) {
            if (num != 0) sum += stack.push(num);
            else sum -= stack.pop();
        }
        return sum;
    }
}
