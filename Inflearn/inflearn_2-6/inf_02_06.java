import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_02_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        boolean[] check = new boolean[100000];

        check[0] = check[1] = true;

        for (int i = 2; i * i < check.length; i++) {
            if (!check[i])
                for (int j = i * i; j < check.length; j += i)
                    check[j] = true;
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder(st.nextToken());
            int target = Integer.parseInt(sb.reverse().toString());
            if (!check[target])
                output.append(target + " ");
        }

        System.out.print(output);
    }
}
