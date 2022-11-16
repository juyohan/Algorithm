import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] arr = new String[size];

        for (int i = 0 ; i < size ; i++) {
            arr[i] = br.readLine();
        }

        solution(arr);
    }

    protected static void solution(String[] arr) {
        int[] ranking = new int[arr.length];
        String[] answer = new String[arr.length];
    
        for (int i = 0 ; i < arr.length ; i++) {
            ranking[i] = arr[i].length();
        }

        for (int i = 1 ; i < ranking.length ; i++) {
            if (ranking[i - 1] == ranking[i]) {
                answer[ranking[i]] = arr[i - 1];


            } else 
                answer[ranking[i - 1]] = arr[i - 1];
        }

        for(String rank : answer) {
            System.out.println(rank);
        }
    }
}
