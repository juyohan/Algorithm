import java.util.*;

public class Main {

/* 	내가 푼 방법
	public int[] solution(int[] arr, int count, int num){
		int[] answer = new int[num];

		for (int i = 0 ; i < num ; i++)
			answer[i] = 0;

		for (int i = 0 ; i < count ; i++) {
			for (int j = num - 1; j > 0 ; j--) {
				if (arr[i] != answer[j])
					answer[j] = answer[j-1];
				else {
					for (int k = j ; k > 0 ; k--)
						answer[k] = answer[k-1];
					break;
				}
			}
			answer[0] = arr[i];
		}

		return answer;
	}
*/
/*
	// 해설 방법
	public int[] solution(int[] arr, int count, int num){
		int[] answer = new int[num];

		for (int i = 0 ; i < num ; i++)
			answer[i] = 0;

		for (int i = 0 ; i < count ; i++) {
			int tmp = -1;
			for (int j = 0 ; j < num ; j++) {
				// Cache에 같은 값이 존재할 경우 (Hit)
				if (arr[i] == answer[j])
					// 같은 값의 위치 저장
					tmp = j;
			}
			// Cache에 같은 값이 없을경우
			if (tmp == -1) {
				for (int k = num - 1 ; k > 0 ; k--) {
					answer[k] = answer[k-1];
				}
			}
			// Cache에 같은 값이 있을 경우 (tmp의 값이 변화 됨)
			else {
				for (int k = tmp ; k > 0 ; k--) {
					answer[k] = answer[k-1];
				}
			}
			answer[0] = arr[i];
		}

		return answer;
	}
*/

	public static void main(String[] argc) {
		Main main = new Main();
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int count = scan.nextInt();
		int[] arr = new int[count];
		for (int i = 0 ; i < count ; i++)
			arr[i] = scan.nextInt();

		for (int k : main.solution(arr, count, num))
			System.out.print(k + " ");

		
	}
}
