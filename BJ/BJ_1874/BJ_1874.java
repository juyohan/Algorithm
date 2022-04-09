import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> value = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int start = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (start < num) {
                for (int j = start + 1; j <= num; j++) {
                    value.push(j);
                    sb.append("+\n");
                }
                start = num;
            } else { // 여기가 중요한 부분
                if (value.peek() != num) {
                    System.out.println("NO");
                    return;
                }
            }
            value.pop(); // 남아있는 값이 입력받을 값과 같다.
            sb.append("-\n");
        }

        System.out.println(sb);
    }
}
