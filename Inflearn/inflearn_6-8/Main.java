import java.util.*;

public class Main {
	public int solution(int num, int target, int[] arr) {
		Arrays.sort(arr);

		int a = num / 2 - 1;
		if (arr[a] < target) {
			for (int i = a ; i < num ; i++) {
				if (arr[i] == target)
					return i+1;
			}
		}
		else if (arr[a] == target)
			return a+1;
		else {
			for (int i = 0 ; i < a ; i++) {
				if (arr[i] == target)
					return i+1;
			}
		}
		return -1;
	}

	public static void main (String[] argc) {
		Main main = new Main();
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int target = scan.nextInt();
		int[] arr = new int[num];

		for (int i = 0 ; i < num ; i++) 
			arr[i] = scan.nextInt();

		System.out.print(main.solution(num, target, arr));
	}
}
