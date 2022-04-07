import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        Arrays.sort(arr);
        int len = arr.length;
        int sum = 0;

        for (int i = 0 ; i < len ; i++)
            sum += arr[i] - '0';

        if (arr[0] != '0' || sum % 3 != 0)
            System.out.println(-1);
        else
            for (int i = len - 1; i >= 0; i--)
                System.out.print(arr[i]);
    }
}
