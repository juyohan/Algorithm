import java.util.Scanner;

public class BJ_2751 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int[] arr = new int[N];
        for (int i = 0 ; i < N ; i++)
            arr[i] = scan.nextInt();

        solution(N, arr);
    }

    public static void solution(int N , int[] arr) {
        for (int i = 1 ; i < N ; i++) {
            int target = arr[i];
            int j = i - 1;
            while(j >= 0 && target < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = target;
        }

        for (int n : arr)
            System.out.println(n);
    }
}
