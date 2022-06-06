package PACKAGE_NAME;

import java.util.*;

public class inf_06_2 {
	public static int[] solution(int[] arr){

		for (int i = 0 ; i < arr.length ; i++) {
			for (int j = i + 1 ; j < arr.length ; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		return arr;
	}

	public static void main(String[] argc) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int[] arr = new int[num];
		for (int i = 0 ; i < num ; i++)
			arr[i] = scan.nextInt();

		for (int k : solution(arr))
			System.out.print(k + " ");
	}
}
