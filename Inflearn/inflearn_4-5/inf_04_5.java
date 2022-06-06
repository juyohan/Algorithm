package PACKAGE_NAME;

import java.util.*;

public class inf_04_5 {
	public static int solution(int[] arr, int card, int pick) {
		int answer = 0;
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

		for (int i = 0 ; i < card ; i++) {
			for (int j = i + 1 ; j < card ; j++) {
				for (int k = j + 1; k < card ; k++) {
					set.add(arr[i] + arr[j] + arr[k]);
				}
			}
		}
		if (set.size() < pick)
			return -1;
		else {
			Object[] value = set.toArray();
			return (int) value[pick - 1];
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int card = scan.nextInt();
		int pick = scan.nextInt();
		int arr[] = new int[card];
		for (int i = 0 ; i < card ; i++) 
			arr[i] = scan.nextInt();

		System.out.print(solution(arr, card, pick));
	}
}
