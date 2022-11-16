package BJ.BJ_1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class BJ_1764 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] arr = new String[N + M];

        for (int i = 0 ; i < N + M ; i++) {
            arr[i] = br.readLine();
        }

        for (String answer : solution(arr)) {
            System.out.println(answer);
        }
    }

    private static String[] solution(String[] arr) {
        int count = 0;
        List<String> list = new ArrayList<>();
        SortedMap<String, Integer> set = new TreeMap<>((s1, s2) -> s1.compareTo(s2));

        for (String str : arr) {
            set.put(str, set.getOrDefault(str, 0) + 1);
        }

        for (String str : set.keySet()) {
            if (set.get(str) > 1) {
                count++;
                list.add(str);
            }
        }

        System.out.println(count);
        return list.stream().toArray(String[]::new);
    }
}
