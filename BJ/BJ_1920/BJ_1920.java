import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_1920 {
    static int[] NArr, MArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        NArr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0 ; i < N ; i++) {
            NArr[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        MArr = new int[M];
        st = new StringTokenizer(br.readLine());
    
        for (int i = 0 ; i < M ; i++) {
            MArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int answer : solution(NArr, MArr))
            System.out.println(answer);
        
    }

    private static int[] solution(int[] NArr, int[] MArr) {
        Arrays.sort(NArr);
        int[] answer = new int[MArr.length];
        int[] answer2 = new int[MArr.length];


        for (int i = 0 ; i < MArr.length ; i++) {
            answer[i] = binarySearch(MArr[i], 0, NArr.length - 1);
            answer2[i] = binarySearch2(MArr[i], 0, NArr.length - 1);
        }

        return answer2;
    }

    // 재귀를 이용한 이분 탐색
    public static int binarySearch(int key, int lt, int rt) {
        int mid;

        if (lt <= rt) {
            mid = (lt + rt) / 2;

            if (key == NArr[mid]) 
                return 1;
            else if (key > NArr[mid]) 
                return binarySearch(key, mid + 1, rt);
            else
                return binarySearch(key, lt, mid - 1);
        }
        return 0;
    }

    // 반복문을 이용한 이분 탐색
    public static int binarySearch2(int key, int lt, int rt) {
        int mid;

        while(lt <= rt) {
            mid = (lt + rt) / 2;

            if (key == NArr[mid]) return 1;
            else if (key > NArr[mid]) lt = mid + 1;
            else rt = mid - 1;
        }
        return 0;
    }
}