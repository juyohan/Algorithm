import java.util.*;

public class Main {
	public int solution(int num, int target, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
/*
		int a = num / 2 - 1;
		if (arr[a] < target) {
			for (int i = a ; i < num ; i++) {
				if (arr[i] == target)
					answer = i;
			}
		}
		else if (arr[a] == target)
			answer = a;
		else {
			for (int i = 0 ; i < a ; i++) {
				if (arr[i] == target)
					answer = i;
			}
		}
		return answer + 1;
*/

		int lt = 0;
		int rt = num - 1;

		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			if (arr[mid] == target) {
				answer = mid;
				break;
			}
			if (arr[mid] > target)
				rt = mid - 1;
			else
				lt = mid + 1;
		}

		return answer + 1;
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
