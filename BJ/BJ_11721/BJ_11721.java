import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11721 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        while (true) {
            if (str.length() < 10) {
                System.out.println(str.substring(0, str.length()));
                break;
            }
            String result = str.substring(0, 10);
            str = str.substring(10, str.length());
            System.out.println(result);
        }
    }
}