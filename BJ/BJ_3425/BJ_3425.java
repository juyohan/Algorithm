import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ_3425 {
    public static List<Integer> numList = new ArrayList<>();
    public static List<String> calList = new ArrayList<>();
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if ("".equals(str)) {
                sb.append("\n");
                numList.clear();
                calList.clear();
            } else if (str.matches("^[0-9]+$")) {
                int N = Integer.parseInt(str); // 수행 횟수를 입력받음.
                for (int i = 0; i < N; i++) {
                    String st = br.readLine();
                    if (st.matches("^[0-9]+$")) // 입력 값이 숫자가 아니면 수행하지 않음.
                        solution2(Integer.parseInt(st));
                }
            } else if (str.equals("QUIT")) break;
            else {
                if (str.startsWith("NUM")) {
                    StringTokenizer st = new StringTokenizer(str);
                    str = st.nextToken();
                    numList.add(Integer.parseInt(st.nextToken()));
                }
                calList.add(str);
            }
        }
        System.out.println(sb);
    }

    public static void solution2(int start) {
        Stack<Integer> valueStack = new Stack<>();
        valueStack.push(start); // 시작 값을 넣음
        int idx = 0;

        for (int i = 0; i < calList.size(); i++) {
            switch (calList.get(i)) {
                case "NUM":
                    if (numList.isEmpty()) {
                        sb.append("ERROR\n");
                        return;
                    }
                    if (isCheck(numList.get(idx))) return;
                    valueStack.push(numList.get(idx++));
                    break;
                case "POP":
                    if (isEmpty(valueStack)) return;
                    valueStack.pop();
                    break;
                case "INV":
                    if (isEmpty(valueStack)) return;
                    valueStack.push(valueStack.pop() * -1);
                    break;
                case "DUP":
                    if (isEmpty(valueStack)) return;
                    valueStack.push(valueStack.peek());
                    break;
                case "SWP": {
                    if (isCount(valueStack)) return;
                    int first = valueStack.pop();
                    int second = valueStack.pop();
                    valueStack.push(first);
                    valueStack.push(second);
                    break;
                }
                case "ADD": {
                    if (isCount(valueStack)) return;
                    long first = valueStack.pop();
                    long second = valueStack.pop();
                    if (isCheck(first + second)) return;
                    valueStack.push((int) (first + second));
                    break;
                }
                case "SUB": {
                    if (isCount(valueStack)) return;
                    long first = valueStack.pop();
                    long second = valueStack.pop();
                    if (isCheck(second - first)) return;
                    valueStack.push((int) (second - first));
                    break;
                }
                case "MUL": {
                    if (isCount(valueStack)) return;
                    long first = valueStack.pop();
                    long second = valueStack.pop();
                    if (isCheck(first * second)) return;
                    valueStack.push((int) (first * second));
                    break;
                }
                case "DIV":
                    if (isCount(valueStack)) return;
                    if (isDiv(valueStack)) return;
                    break;
                case "MOD":
                    if (isCount(valueStack)) return;
                    if (isMod(valueStack)) return;
                    break;
                default:
                    if (valueStack.size() != 1)
                        sb.append("ERROR\n");
                    else
                        sb.append(valueStack.pop() + "\n");
                    return;
            }
        }
    }

    public static boolean isMod(Stack<Integer> stack) {
        long first = stack.pop();
        long second = stack.pop();

        if (first == 0) {
            sb.append("ERROR\n");
            return true;
        }

        long mod = Math.abs(second) % Math.abs(first);
        if (second < 0) mod *= -1;

        stack.push((int) mod);
        return false;
    }

    public static boolean isDiv(Stack<Integer> stack) {
        long first = stack.pop();
        long second = stack.pop();

        if (first == 0) {
            sb.append("ERROR\n");
            return true;
        }

        long div = Math.abs(second) / Math.abs(first);
        if ((first < 0 && second < 0) || (first > 0 && second > 0))
            stack.push((int) div);
        else
            stack.push((int) div * -1);
        return false;
    }

    public static boolean isCheck(long num) {
        if (Math.abs(num) > (int) Math.pow(10, 9)) {
            sb.append("ERROR\n");
            return true;
        }
        return false;
    }

    public static boolean isCount(Stack<Integer> stack) {
        if (stack.size() < 2) {
            sb.append("ERROR\n");
            return true;
        }
        return false;
    }

    public static boolean isEmpty(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            sb.append("ERROR\n");
            return true;
        }
        return false;
    }
}
