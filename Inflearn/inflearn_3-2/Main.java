import java.util.*;

public class Main {
	public ArrayList<Integer> solution(int[] arr1, int[] arr2) {
		ArrayList<Integer> list = new ArrayList<>();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int p1 = 0;
		int p2 = 0;

		while (p1 < arr1.length && p2 < arr2.length) {
			if (arr1[p1] == arr2[p2]) {
				list.add(arr1[p1]);
				p1++;
				p2++;
			}
			else if (arr1[p1] > arr2[p2]) 
				p2++;
			else
				p1++;
		}
/*
		for (int i = 0 ; i < arr1.length ; i++) {
			for (int j = 0 ; j < arr2.length ; j++) {
				if (arr1[i] == arr2[j]) {
					list.add(arr1[i]);
					break;
				}
			}
		}
*/
//		Collections.sort(list);

		return list;
	}

	public static void main(String[] argc) {
//		ArrayList<Integer> lists1 = new ArrayList<>();
//		ArrayList<Integer> lists2 = new ArrayList<>();
		Main main = new Main();
		Scanner scan = new Scanner(System.in);

		int first = scan.nextInt();
		int[] arr1 = new int[first];
		for (int i = 0 ; i < first ; i++) {
//			lists1.add(scan.nextInt());
			arr1[i] = scan.nextInt();
		}

		int seconds = scan.nextInt();
		int[] arr2 = new int[seconds];
		for (int i = 0 ; i < seconds ; i++) {
//			lists2.add(scan.nextInt());
			arr2[i] = scan.nextInt();
		}

//		lists2.retainAll(lists1);
//		Collections.sort(lists2);
		for (int num : main.solution(arr1, arr2)) 
			System.out.print(num + " ");
//		System.out.print(lists2);
	}
}
