import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BJ_1644 {
    public static int N;
    public static boolean[] prime;
    public static List<Integer> list = new ArrayList<>();
    public static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        setPrime();

        System.out.println(result);
    }

    public static void setPrime() {
        prime = new boolean[N + 1];
        prime[0] = prime[1] = true;

        for (int i = 2; i * i <= N; i++) {
            if (!prime[i])
                for (int j = i * i; j <= N; j += i) prime[j] = true;
        }

        for (int i = 1; i <= N; i++)
            if (!prime[i]) list.add(i);

        solution();
    }

    public static void solution() {
        int lt = 0, rt = 0, sum = 0;

//        while(true) {
//            int sum = 0;
//
//            if (rt == list.size()) break;
//
//            for (int j = lt ; j <= rt ; j++)
//                sum += list.get(j);
//
//            if (sum == N) {
//                result++;
//                lt++;
//            } else if (sum < N) rt++;
//            else lt++;
//        }

        while (true) {
            if (sum >= N) sum -= list.get(lt++);
            else if (rt == list.size()) break;
            else sum += list.get(rt++);
            if (sum == N) result++;
        }
    }
}
