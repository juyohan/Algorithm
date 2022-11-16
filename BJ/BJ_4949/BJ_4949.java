package BJ.BJ_4949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while (true) {
            String value = br.readLine();
            
            if (value.equals(".")) break;

            str += value;
            if (!value.contains(".")) {
                continue;
            }
            
            Stack<Character> stack = new Stack<>();

            for (char c : str.toCharArray()) {
                if (Character.isAlphabetic(c)) continue;

                switch(c) {
                    case '(':
                    case '[':
                        stack.push(c);
                        continue;
                    case ')':
                        if (!stack.isEmpty() && stack.peek() == '(') {
                            stack.pop();
                        } else {
                            stack.push('x');
                        }
                        break;
                    case ']':
                        if (!stack.isEmpty() && stack.peek() == '[') {
                                stack.pop();
                        } else {
                            stack.push('x');
                        }
                        break;
                }
            }

            if (stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            str = "";
        }
    }
}
