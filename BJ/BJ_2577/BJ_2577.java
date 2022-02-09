import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BJ_2577 {
    public static void main(String[] argc) {
        Scanner scan = new Scanner(System.in);
        long value = 1;
        for (int i = 0; i < 3; i++)
            value *= scan.nextInt();

        solution(value);
    }

    public static void solution(long value) {
        Map<Long, Integer> map = new HashMap<>();

        check(map, divide(map, value));
        for (long i = 0; i < 10 ; i++) {
            if (!map.containsKey(i))
                System.out.println("0");
            else
                System.out.println(map.get(i));
        }
    }

    public static void check(Map<Long, Integer> map, long value) {
        if (map.containsKey(value % 10))
            map.put(value % 10, map.get(value % 10) + 1);
        else
            map.put(value % 10, 1);
    }

    public static long divide(Map<Long, Integer> map, long value) {
        if (value < 10) {
            return value;
        }
        check(map, value % 10);
        return divide(map, value / 10);
    }
}
