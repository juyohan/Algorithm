import java.util.*;

public class inf_2_3 {
	public ArrayList<Character> solution(int[] a, int[] b, int count) {
		ArrayList<Character> answer = new ArrayList<>();
		
		for (int i = 0 ; i < count ; i++) {
			if (a[i] == b[i]) 
				answer.add('D');
			else if (a[i] == 1 && b[i] == 3) 
				answer.add('A');
			else if (a[i] == 2 && b[i] == 1)
				answer.add('A');
			else if (a[i] == 3 && b[i] == 2)
				answer.add('A');
			else
				answer.add('B');
		}
		return answer;
	}

	public static void main(String[] args) {
		inf_2_3 inf = new inf_2_3();
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int[] a = new int[count];
		int[] b = new int[count];

		for (int i = 0 ; i < count ; i++)
			a[i] = scan.nextInt();
		for (int i = 0 ; i < count ; i++)
			b[i] = scan.nextInt();

		for (char c : inf.solution(a,b,count))
			System.out.println(c);
	}
}
