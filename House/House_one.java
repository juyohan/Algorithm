import java.util.ArrayList;
import java.util.List;

public class House_one {
    public static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        String path = "EEESEEEEEENNNN";
//        String path = "SSSSSSWWWNNNNNN";
        String[] answer = {};

        char[] pathArr = path.toCharArray();
        char target = pathArr[0];

        int cnt = 0;
        for (int i = 1 ; i < pathArr.length ; i++)
            if (target != pathArr[i]) {
                target = pathArr[i];
                cnt++;
            }

        answer = new String[cnt];
        int M = 1, T = 0, idx = 0;

        for (int i = 1; i < pathArr.length; i++) {
            if (target != pathArr[i]) {
                String dir = direction(pathArr[i - 1], pathArr[i]);
                while( M > 5 ) {
                    M--;
                    T++;
                }
                answer[idx++] = "Time " + T + ": Go straight " + M * 100 + "m and turn " + dir;
                T += M;
                target = pathArr[i];
                M = 0;
            }
            M++;
        }
        for (String str : answer) {
            System.out.println("str = " + str);
        }
    }

    public static String direction(char dir, char nextDir) {
        if (dir == 'E' || dir == 'N') {
            if (nextDir == 'S' || nextDir == 'E') return "right";
            else return "left";
        } else {
            if (nextDir == 'W' || nextDir == 'N') return "right";
            else return "left";
        }
    }
}
