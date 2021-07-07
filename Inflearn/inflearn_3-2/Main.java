import java.util.*;

public class Main {
	public static void main(String[] argc) {
		ArrayList<Integer> lists1 = new ArrayList<>();
		ArrayList<Integer> lists2 = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		for (int i = 0 ; i < first ; i++) {
			lists1.add(scan.nextInt());
		}
		int seconds = scan.nextInt();
		for (int i = 0 ; i < seconds ; i++) {
			lists2.add(scan.nextInt());
		}
		lists2.retainAll(lists1);
		Collections.sort(lists2);
//		for (int num : lists2) {
//			System.out.print(num + " ");
//		}
		System.out.print(lists2);
	}
}
