import java.util.*;

public class Main {
	public int[] solution(int[] arr){

		for (int i = 1 ; i < arr.length ; i++) {
			int target = arr[i];

/*			내 방식
			for (int j = i - 1 ; j >= 0 ; j--) {
				if (target < arr[j]) {
					arr[j+1] = arr[j];
					arr[j] = target;
				}
				else
					break;
			}
*/

			// 다른 방식
			int j = i - 1;
			while(j >= 0 && target < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = target;
		}

		return arr;
	}

	public static void main(String[] argc) {
		Main main = new Main();
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int[] arr = new int[num];
		for (int i = 0 ; i < num ; i++)
			arr[i] = scan.nextInt();

		for (int k : main.solution(arr))
			System.out.print(k + " ");
	}
}
