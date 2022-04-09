import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BJ_1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());


        for (int i = 0 ; i < T ; i++) {
            int N = Integer.parseInt(br.readLine());
            int[][] scores = new int[N][2];
            for (int j = 0 ; j < N ; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                scores[j][0] = Integer.parseInt(st.nextToken());
                scores[j][1] = Integer.parseInt(st.nextToken());
            }
            System.out.println(solution(N, scores));
        }
    }

    public static int solution(int N, int[][] scores) {
        Arrays.sort(scores, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        }); // 오름차순

        int standard = scores[0][1];
        int cnt = 1;
        for (int i = 1; i < N ; i++) {
            if (standard > scores[i][1]) {
                standard = scores[i][1];
                cnt++;
            }
        }

        return cnt;
    }
}
