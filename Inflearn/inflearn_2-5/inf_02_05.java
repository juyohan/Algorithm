import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_02_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[] check = new boolean[N];

        check[0] = check[1] = true;

        for (int i = 2; i * i < N; i++) {
            if (!check[i]) {
                for (int j = i * i; j < N; j += i) check[j] = true;
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++)
            if (!check[i]) count++;

        System.out.print(count);
    }
}
