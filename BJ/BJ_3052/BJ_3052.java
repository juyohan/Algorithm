import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BJ_3052 {
    static Set<Integer> list = new HashSet<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0 ; i < 10 ; i++) {
            int num = scan.nextInt();
            list.add(num % 42);
        }

        System.out.println(list.size());
    }

}
