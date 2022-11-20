import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

class BJ_10866 {
    static Deque<Integer> deque = new LinkedList<>();
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
s
            for (int i = 0 ; i < N ; i++) {
                solution(br.readLine());
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void solution(String str) {
        StringTokenizer st = new StringTokenizer(str);
        String caseStr = st.nextToken();

        switch(caseStr) {
            case "push_front":
                deque.addFirst(Integer.parseInt(st.nextToken()));
                return ;
            case "push_back":
                deque.addLast(Integer.parseInt(st.nextToken()));
                return ;
            case "empty":
                if (deque.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
                return ;
            case "size":
                System.out.println(deque.size());
                return ;
        }

        if (deque.isEmpty()) {
            System.out.println(-1);
            return ;
        }

        switch(caseStr) {
            case "pop_front":
                System.out.println(deque.pollFirst());
                break;
            case "pop_back":
                System.out.println(deque.pollLast());
                break;
            case "front":
                System.out.println(deque.peekFirst());
                break;
            case "back":
                System.out.println(deque.peekLast());
                break;
        }
    }
}