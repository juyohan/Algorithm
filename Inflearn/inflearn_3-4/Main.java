import java.util.*;

public class Main {
	public int solution(int[] arr, int k) {
		int answer = 0;
		int sum = 0;
		int count = 0;

		for (int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
			if (sum == k)
				answer++;
			while (sum >= k) {
				sum -= arr[count];
				count++;
				if (sum == k)
					answer++;
			}
		}

		return answer;
	}

	public static void main(String[] argc) {
		Main main = new Main();
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int sum = scan.nextInt();
		int arr[] = new int[len];
		for (int i = 0 ; i < len ; i++) 
			arr[i] = scan.nextInt();

		System.out.print(main.solution(arr, sum));

	}
}
