import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class inf_07_11 {
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> maps = new ArrayList<>();

        for (int i = 0; i <= N; i++)
            maps.add(new ArrayList<>());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            maps.get(num1).add(num2);
        }

        System.out.print(solution(maps, N));
    }

    public static int solution(ArrayList<ArrayList<Integer>> maps, int N) {
        int[] check = new int[N + 1];
        check[1] = 1;

        DFS(maps, check, 1);

        return answer;
    }

    public static void DFS(ArrayList<ArrayList<Integer>> maps, int[] check, int start) {
        if (start == maps.size()) answer++;
        else {
            for (int value : maps.get(start)) {
                if (check[value] == 0) {
                    check[value] = 1;
                    DFS(maps, check, value);
                    check[value] = 0;
                }
            }
        }
    }
}
