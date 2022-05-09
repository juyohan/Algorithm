import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_03_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int count = 0, lt = 0, rt = 0, max = 0;

        while (rt < N) {
            if (arr[rt] == 0) count++;
            while (count > k) {
                if (arr[lt] == 0) count--;
                lt++;
            }
            max = Math.max(max, rt - lt + 1);
            rt++;
            /**
             * 내가 푼 방법
            if (arr[rt] == 1) {
                count++;
                rt++;
            } else if (arr[rt] == 0) {
                if (k > 0) {
                    count++;
                    rt++;
                    k--;
                } else if (k == 0) {
                    max = Math.max(max, count);
                    while (arr[lt] >= 0) { // lt 가 0 을 만날 때까지,
                        if (arr[lt] == 0) {
                            k++;
                            lt++;
                            count--;
                            break;
                        }
                        lt++;
                        count--;
                    }
                }
            }
             */
        }
        System.out.println(max);
    }
}
