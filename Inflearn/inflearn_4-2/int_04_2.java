import java.util.*;

public class int_04_2 {
	public static String solution(String str1, String str2) {
		String answer = "";

		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		for (char c : str1.toCharArray()) {
			map1.put(c, map1.getOrDefault(c, 0) +1);
		}

		for (char c : str2.toCharArray()) {
			map2.put(c, map2.getOrDefault(c, 0) + 1);
		}

		if (map1.equals(map2) == true)
			answer = "YES";
		else 
			answer = "NO";

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str1 = scan.next();
		str1 = str1.toUpperCase();

		String str2 = scan.next();
		str2 = str2.toUpperCase();

		System.out.print(solution(str1, str2));
	}
}
