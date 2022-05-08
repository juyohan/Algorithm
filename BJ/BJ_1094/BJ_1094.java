<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int branch = 64, cnt = 0;

        while (branch > 0) {
            if (branch <= X) {
                X -= branch;
                cnt++;
            }
            if (X == 0) {
                break;
            }
            branch /= 2;
        }
        System.out.println(cnt);
    }
=======
package PACKAGE_NAME;public class BJ_1094 {
>>>>>>> origin/master
}
