import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_10817 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();

            solution(str);
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void solution(String str) {
        int[] arr = Arrays.stream(str.split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
