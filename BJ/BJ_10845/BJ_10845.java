import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_10845 {
    static Queue<Integer> queue = new LinkedList<Integer>();
    static int BACK = 0;
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            
            for (int i = 0 ; i < N ; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                solution(st);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void solution(StringTokenizer st) {
        switch(st.nextToken()) {
            case "push":
                int value = Integer.parseInt(st.nextToken());
                queue.offer(value);
                BACK = value;
                break;
            case "pop":
                if (queue.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(queue.poll());
                break;
            case "size":
                System.out.println(queue.size());
                break;
            case "empty":
                if (queue.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);
                break;
            case "front":
                if (queue.isEmpty())
                    System.out.println(-1);
                else 
                    System.out.println(queue.peek());
                break;
            case "back":
                if (queue.isEmpty() || BACK == 0)
                    System.out.println(-1);
                else
                    System.out.println(BACK);
                break;
            }
    }
}
