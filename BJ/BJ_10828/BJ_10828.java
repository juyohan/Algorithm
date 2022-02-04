import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BJ_10828 {
    public static Stack<Integer> stack = new Stack<>();
    public static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int size =Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            solution(br.readLine());
        }

        result.stream().forEach(value -> System.out.println(value));
    }

    public static void solution(String str) {
        switch (str) {
            case "pop":
                result.add(stack.isEmpty() ? -1 : stack.pop());
                break;
            case "size":
                result.add(stack.isEmpty() ? 0 : stack.size());
                break;
            case "top":
                result.add(stack.isEmpty() ? -1 : stack.peek());
                break;
            case "empty":
                result.add(stack.isEmpty() ? 1 : 0);
                break;
            default: {
                String[] split = str.split(" ");
                stack.push(Integer.parseInt(split[1]));
                break;
            }
        }
    }
}
