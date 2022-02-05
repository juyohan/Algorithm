import java.util.Scanner;

public class BJ_2839 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kg = scan.nextInt();

        System.out.println(solution(kg));
    }

    // 시간 복잡도 O(1)
    public static Integer solution(int kg) {
        int result = 0;

        if (kg == 4 || kg == 7)
            result = -1;
        else if (kg % 5 == 0)
            result = kg / 5;
        else if ((kg % 5) == 3 || (kg % 5) == 1)
            result = (kg / 5) + 1;
        else if ((kg % 5) == 2 || (kg % 5) == 4)
            result = (kg / 5) + 2;

        return result;
    }
}
