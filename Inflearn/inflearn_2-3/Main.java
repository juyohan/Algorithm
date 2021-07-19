import java.util.*;

public class Main {
	public ArrayList<Character> solution(int num, int[] a, int[] b) {
		ArrayList<Character> list = new ArrayList<>();

		for (int i = 0 ; i < num ; i++) {
			if (a[i] > b[i]) {
				if (a[i] == 3 && b[i] == 1)
					list.add('B');
				else
					list.add('A');
			}
			else if (a[i] == b[i])
				list.add('D');
			else {
				if (b[i] == 3 && a[i] == 1)
					list.add('A');
				else
					list.add('B');
			}
		}

		return list;
	}

	public static void main(String[] argc) {
		Main main = new Main();
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int[] a = new int[num];
		int[] b = new int[num];

		for (int i = 0 ; i < num ; i++)
			a[i] = scan.nextInt();

		for (int i = 0 ; i < num ; i++)
			b[i] = scan.nextInt();

		for (char c : main.solution(num, a, b))
			System.out.println(c);
	}
}
