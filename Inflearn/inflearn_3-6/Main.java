import java.util.*;

public class Main {
	public int solution(int[] arr, int num) {
		int answer = 0;
		int count = 0;
		int num1 = 0;

		}

		return answer;
	}

	public static void main(String[] argc) {
		Main main = new Main();
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int[] arr = new int[len];
		
		int num = scan.nextInt();

		for (int i = 0 ; i < len ; i++) 
			arr[i] = scan.nextInt();

		System.out.print(main.solution(arr, num));
	}
}
