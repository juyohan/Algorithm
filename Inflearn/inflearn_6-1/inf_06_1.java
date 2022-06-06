import java.util.*;

public class inf_06_1 {
	public static int[] solution(int[] arr){

		for (int k = 0 ; k < arr.length ; k++) {
			int min = k;
			for (int i = k + 1 ; i < arr.length ; i++) {
				if (arr[i] < arr[min])
					min = i;
			}
			int tmp = arr[min];
			arr[min] = arr[k];
			arr[k] = tmp;
		}

		return arr;
	}

	public static void main(String[] argc) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int[] arr = new int[num];
		for (int i = 0 ; i < num ; i++) {
			arr[i] = scan.nextInt();
		}

		for (int k : solution(arr))
			System.out.print(k + " ");
	}
}
