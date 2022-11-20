import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1439 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();

            System.out.println(solution2(str)); 
            System.out.println(solution(str));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static int solution2(String str) {
        StringTokenizer st1 = new StringTokenizer(str, "1"); // 토큰으로 나눌 수 있음.
        StringTokenizer st0 = new StringTokenizer(str, "0");

        return Math.min(st0.countTokens(), st1.countTokens());
    }

    public static int solution(String str) {
        int lt = 0, rt = 0, zero = 0, one = 0; // count 는 덩이 개념으로

        if (str.charAt(lt) == '1')
            one++;
        else
            zero++;

        while(rt < str.length()) {
            if (str.charAt(lt) == str.charAt(rt)) {
                rt++;
            } else {
                lt = rt;
                if (str.charAt(rt) == '1')
                    one++;
                else
                    zero++;
            }
        }

        return one > zero ? zero : one;
    }
}
