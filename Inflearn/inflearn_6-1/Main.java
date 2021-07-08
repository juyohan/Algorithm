import java.util.*;

public class Main {
	public int[] solution(int[] arr){

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
		Main main = new Main();
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int[] arr = new int[num];
		for (int i = 0 ; i < num ; i++) {
			arr[i] = scan.nextInt();
		}

		for (int k : main.solution(arr))
			System.out.print(k + " ");
	}
}
