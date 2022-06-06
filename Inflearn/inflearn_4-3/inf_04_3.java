package PACKAGE_NAME;

import java.util.*;

public class inf_04_3 {
	public static ArrayList<Integer> solution(int[] value, int days, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> answer = new ArrayList<>();

		for (int i = 0 ; i < k ; i++) {
			map.put(value[i], map.getOrDefault(value[i], 0) + 1);
		}

		int lt = 0;
		answer.add(map.size());

		for (int i = k ; i < days ; i++) {
			map.put(value[i], map.getOrDefault(value[i], 0) + 1);
			if (map.get(value[lt]) == 1)
				map.remove(value[lt]);
			else 
				map.put(value[lt], map.get(value[lt]) -1);
			lt++;
			answer.add(map.size());
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int days = scan.nextInt();
		int k = scan.nextInt();
		int value[] = new int[days];

		for (int i = 0 ; i < days ; i++) 
			value[i] = scan.nextInt();

		for (int num : solution(value, days, k))
			System.out.print(num + " ");
	}
}
