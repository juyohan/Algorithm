import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class inf_07_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (String str : solution(N))
            System.out.println(str);
    }

    public static String[] solution(int N) {
        List<String> list = new ArrayList<>();

        int[] arr = new int[N];
        for (int i = 1; i <= N; i++)
            arr[i - 1] = i;

        boolean[] check = new boolean[N];
        list = DFS(list, arr, check, N, 0);

        Collections.reverse(list);

        return list.toArray(String[]::new);
    }

    public static List<String> DFS(List<String> list, int[] arr, boolean[] check, int N, int start) {
        if (start == N) {
            String str = "";
            for (int i = 0 ; i < N ; i++) {
                if (check[i] == true)
                    str += arr[i] + " ";
            }
            list.add(str);
            return list;
        }

        check[start] = false;
        list = DFS(list, arr, check, N, start + 1);

        check[start] = true;
        list = DFS(list, arr, check, N, start + 1);

        return list;
    }
}
