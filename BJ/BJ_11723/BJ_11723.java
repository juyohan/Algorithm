import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BJ_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int num = 0;

            switch (str) {
                case "add":
                    num = Integer.parseInt(st.nextToken());
                    if (!list.contains(num))
                        list.push(num);
                    break;
                case "remove":
                    num = Integer.parseInt(st.nextToken());
                    if (list.contains(num) && !list.isEmpty())
                        list.remove(list.indexOf(num));
                    break;
                case "check":
                    num = Integer.parseInt(st.nextToken());
                    if (list.contains(num)) sb.append(1 + "\n");
                    else sb.append(0 + "\n");
                    break;
                case "toggle":
                    num = Integer.parseInt(st.nextToken());
                    if (list.contains(num) && !list.isEmpty())
                        list.remove(list.indexOf(num));
                    else
                        list.push(num);
                    break;
                case "all":
                    list.clear();
                    for (int j = 1; j < 21; j++)
                        list.push(j);
                    break;
                case "empty":
                    list.clear();
                    break;
            }
        }
        System.out.print(sb);
    }
}
