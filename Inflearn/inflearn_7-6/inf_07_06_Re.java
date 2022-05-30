import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_07_06_Re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        solution(N);
    }

    public static void solution(int N) {
        boolean[] check = new boolean[N];

        DFS(0, check, N);
    }

    public static void DFS(int start, boolean[] check, int N) {
        if (start == N) {
            for (int i = 0; i < N; i++) {
                if (check[i])
                    System.out.print((i + 1) + " ");
            }
            System.out.println();
        } else if (start < N) {
            check[start] = true;
            DFS(start + 1, check, N);

            check[start] = false;
            DFS(start + 1, check, N);
        }
    }
}
