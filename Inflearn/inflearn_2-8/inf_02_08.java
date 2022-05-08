import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_02_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] scores = new int[N];
        int[] rank = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            scores[i] = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 0; j < N; j++) {
                if (scores[i] < scores[j])
                    count++;
            }
            rank[i] = count;
        }

        for (int k : rank)
            System.out.print(k + " ");
    }
}
