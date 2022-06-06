import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class inf_07_12_Re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] maps = new int[M][2];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            maps[i][0] = Integer.parseInt(st.nextToken());
            maps[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] answer = solution(maps, N);
        for (int i = 2; i <= N; i++) {
            System.out.println(i + " : " + answer[i]);
        }
    }

    public static int[] solution(int[][] maps, int N) {
        Map<Integer, List<Integer>> listMap = new HashMap<>();

        for (int i = 1; i <= N; i++)
            listMap.put(i, new ArrayList<>());

        for (int[] map : maps) {
            List<Integer> list = listMap.get(map[0]);
            list.add(map[1]);
            listMap.put(map[0], list);
        }

        return BFS(listMap, N);
    }

    public static int[] BFS(Map<Integer, List<Integer>> maps, int N) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        int count = 0;
        int[] arr = new int[N + 1];
        boolean[] check = new boolean[N + 1];

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int value = queue.poll();
                if (!check[value]) {
                    check[value] = true;
                    arr[value] = count;
                    for (int k : maps.get(value))
                        queue.add(k);
                }
            }
            count++;
        }
        return arr;
    }
}
