package PACKAGE_NAME;

import java.util.*;

public class inf_04_1 {
	public static char solution(String str, int students) {
		char answer = ' ';

		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (char x : str.toCharArray()) {
			hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
		}
		int max = 0;
		for (char x : hashMap.keySet()) {
			if (hashMap.get(x) > max) { 
				max = hashMap.get(x);
				answer=x;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int students = scan.nextInt();
		String str = scan.next();

		System.out.print(solution(str, students));
	}
}
