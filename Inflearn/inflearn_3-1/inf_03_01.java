import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class inf_03_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
            arr1[i] = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M + N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M + N; i++) {
            if (i < N) {
                arr2[i] = arr1[i];
                continue;
            }
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr2);

        for(int k : arr2)
            System.out.print(k + " ");
    }
}
