import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BJ_11399 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0 ; i < N ; i++)
            list.add(scan.nextInt());

        solution(list);
    }

    public static void solution(List<Integer> list) {
//        List<Integer> sumList = new ArrayList<>();
        int sum = 0, result = 0;
        Collections.sort(list);

        for (int i = 0 ; i < list.size() ; i++) {
            sum += list.get(i);
            result += sum;
//            sumList.add(sum);
        }

        System.out.println(result);
//        System.out.println(sumList.stream().mapToInt(x -> x).sum());
    }
}
