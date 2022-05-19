import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class inf_06_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for (int number : solution(S, arr))
            System.out.print(number + " ");
    }

    public static int[] solution(int S, int[] arr) {
        int[] answer = new int[S];

        for (int number : arr) {
            int index = -1;

            for (int i = 0 ; i < S ; i++)
                if (answer[i] == number) index = i;

            if (index < 0) {
                for (int i = S - 1; i > 0; i--) {
                    if (answer[i - 1] == 0) continue;
                    answer[i] = answer[i - 1];
                }
            } else {
                for (int i = index; i > 0; i--)
                    answer[i] = answer[i - 1];
            }
            answer[0] = number;
        }

        return answer;
    }
}
