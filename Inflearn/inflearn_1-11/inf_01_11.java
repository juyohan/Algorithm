import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_01_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();

        String answer = "";
        int lt = 0, rt = 0, count = 0;
        while (rt < inputString.length()) {
            if (inputString.charAt(lt) == inputString.charAt(rt)) {
                count++;
                rt++;
            }
            else {
                answer += inputString.charAt(lt);
                if (count > 1)
                    answer += count;
                lt = rt;
                count = 0;
            }
        }
        answer += inputString.charAt(lt);
        if (count > 1)
            answer += count;
        System.out.println(answer);
    }
}
