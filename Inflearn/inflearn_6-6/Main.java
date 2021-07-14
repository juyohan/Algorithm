import java.util.*;

public class Main {
	public List<Integer> solution(int num, int[] arr) {
		List<Integer> answer = new ArrayList<>();
		// Arrays.copyOf(복제할 배열, 복제할 크기);
//		int[] tmp = Arrays.copyOf(arr, num);
		// 복제할 배열.clone() -> 배열을 복제해서 새로 배열을 생성
		// arr과 tmp는 서로 다른 메모리를 가르키므로 arr.equals(tmp) = false가 나옴.
		int[] tmp = arr.clone();
		Arrays.sort(tmp);

		for (int i = 0 ; i < num ; i++) {
			if (arr[i] != tmp[i]) {
				answer.add(i+1);
			}
		}		

		return answer;
	}

	public static void main(String[] argc) {
		Main main = new Main();
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int[] arr = new int[num];

		for (int i = 0 ; i < num ; i++)
			arr[i] = scan.nextInt();

		for (int result : main.solution(num, arr))
			System.out.print(result + " ");
	}
}
