import java.util.*;

public class inf_05_3 {
	public static Integer solution(int size, int[][] arr, int count, int[] countArr) {
		Stack<Integer> stack = new Stack<>();
		int answer = 0;

		for (int i = 0 ; i < count ; i++) {
			int num = countArr[i] - 1;
			for (int j = 0 ; j < size ; j++) {
				if (arr[j][num] != 0) {
					if (stack.isEmpty())
						stack.push(arr[j][num]);
					else if (arr[j][num] == stack.peek()){
						stack.pop();
						answer += 2;
					}
					else if (arr[j][num] != stack.peek())
						stack.push(arr[j][num]);
					arr[j][num] = 0;
					break;
				}
			}
		}

		return answer;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int size = scan.nextInt();
		int[][] arr = new int[size][size];

		for (int i = 0 ; i < size ; i++) {
			for (int j = 0 ; j < size; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		int count = scan.nextInt();
		int[] countArr = new int[count];
		for (int i = 0 ; i < count ; i++) 
			countArr[i] = scan.nextInt();

		System.out.print(solution(size, arr, count, countArr));
	}
}
