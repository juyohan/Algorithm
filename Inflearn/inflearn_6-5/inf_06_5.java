import java.util.*;

public class inf_06_5 {
	public static Character solution(int num, int[] arr) {
		Arrays.sort(arr);

		for (int i = 0 ; i < num - 1 ; i++) {
			if (arr[i] == arr[i+1])
				return 'D';
		} 

		return 'U';
	}

	public static void main(String[] argc) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int[] arr = new int[num];

		for (int i = 0 ; i < num ; i++)
			arr[i] = scan.nextInt();

		System.out.print(solution(num, arr));
	}
}
