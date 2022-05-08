import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class inf_02_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] score = new int[N + 1];
        score[0] = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            if (Integer.parseInt(st.nextToken()) == 1) {
                score[i] = score[i - 1] + 1;
            } else {
                score[i] = 0;
            }
        }
        System.out.print(Arrays.stream(score).sum());
    }
}
