import java.util.*;

public class BJ_2562 {
	public static void main(String argc[]) {
		Scanner scan = new Scanner(System.in);
		Set<Integer> set = new LinkedHashSet<>();

		for (int i = 0 ; i < 9 ; i++) {
			set.add(scan.nextInt());
		}

		Integer integer = set.stream().max(Comparator.comparing(x -> x)).get();
		List<Integer> list = new ArrayList<>(set);
		System.out.println(integer);
		System.out.println(list.indexOf(integer) + 1);
	}
}
