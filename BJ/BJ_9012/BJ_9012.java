import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BJ_9012 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < size; i++)
            list.add(scan.nextLine());

        solution(list);
    }

    public static void solution(List<String> list) {
        for (String str : list) {
            System.out.println(checkValidate(str));
        }
    }

    public static String checkValidate(String str) {
        Stack<Character> stack = new Stack<>();
        String result = "YES";

        for (char c : str.toCharArray()) {
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case ')':
                    if (!stack.isEmpty())
                        stack.pop();
                    else
                        result = "NO";
                    break;
            }
        }
        if (!stack.isEmpty())
            result = "NO";
        return result;
    }
}
