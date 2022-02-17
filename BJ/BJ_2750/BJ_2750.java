import java.util.Scanner;

public class BJ_2750 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = scan.nextInt();

        solution(arr, N);
    }

    public static void solution(int[] arr, int N) {
        int min = 0;
        for (int i = 0 ; i < N - 1; i++) {
            min = i;
            for (int j = i + 1 ; j < N ; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            arr = switchArr(arr, i, min);
        }

        for (int i : arr)
            System.out.println(i);
    }

    public static int[] switchArr(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

        return arr;
    }
}
