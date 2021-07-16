import java.util.*;

public class Main {
	public ArrayList<Integer> solution(int num, int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0 ; i < num ; i++) {
			if (i == 0)
				list.add(arr[i]);
			else {
				if (arr[i] > arr[i - 1])
					list.add(arr[i]);
			}
		}

		return list;
	}

	public static void main(String[] argc) {
		Main main = new Main();
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int[] arr = new int[num];

		for (int i = 0 ; i < num ; i++)
			arr[i] = scan.nextInt();

		for (int k : main.solution(num, arr))
			System.out.print(k + " ");
	}
}
