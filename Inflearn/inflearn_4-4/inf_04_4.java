import java.util.*;

public class inf_04_4 {
	public static int solution(String str1, String str2) {
		HashMap<Character, Integer> map1 = new HashMap<>();
		char[] str  = str1.toCharArray();
		HashMap<Character, Integer> map2 = new HashMap<>();
		int answer = 0;

		for (char c : str2.toCharArray())
			map1.put(c, map1.getOrDefault(c, 0) + 1);

		for (int i = 0 ; i < str2.length() - 1 ; i++) {
			map2.put(str[i], map2.getOrDefault(str[i], 0) + 1);	
		}

		int lt = 0;
		for (int i = str2.length() - 1 ; i < str.length ; i++) {
			map2.put(str[i], map2.getOrDefault(str[i], 0) + 1);

			if (map2.equals(map1))
				answer++;

			if (map2.get(str[lt]) == 1)
				map2.remove(str[lt]);
			else
				map2.put(str[lt], map2.get(str[lt]) - 1);
			lt++;
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str1 = scan.next();
		String str2 = scan.next();

		System.out.print(solution(str1, str2));
	}
}
