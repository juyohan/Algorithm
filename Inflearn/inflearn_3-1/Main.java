import java.util.*;

public class Main {
	public static void main(String[] argc) {
		Main main = new Main();
		int first, second;
		ArrayList<Integer> lists = new ArrayList<>();

		Scanner scan = new Scanner(System.in);
		first = scan.nextInt();
		for (int i = 0 ; i < first ; i++) {
			lists.add(scan.nextInt());
		}
		second = scan.nextInt();
		for (int i = 0 ; i < second ; i++) {
			lists.add(scan.nextInt());
		}
		Collections.sort(lists);

		for (int num : lists) { 
			System.out.print(num + " ");
		}
	}
}
