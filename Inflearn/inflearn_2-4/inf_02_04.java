import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_02_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        arr[0] = arr[1] = 1;
        for (int i = 2; i < N; i++)
            arr[i] = arr[i - 2] + arr[i - 1];

        for (int k : arr)
            System.out.print(k + " ");
    }
}
