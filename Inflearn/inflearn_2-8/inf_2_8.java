import java.util.*;

public class inf_2_8 {
	public ArrayList<Integer> solution(int[] scores, int num) {
		ArrayList<Integer> answer = new ArrayList<>();

		for (int i = 0 ; i < num; i++) {
			int award = 1;
			// 여기도 전체 돌아야 하므로 num-1 이 아니라 num이 와야한다.
			for (int j = 0 ; j < num; j++) {
				if (scores[i] < scores[j]) 
					award++;
			}
			answer.add(award);
		}

		return answer;
	}

	public static void main(String[] args) {
		inf_2_8 inf = new inf_2_8();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] scores = new int[num];

		for (int i = 0 ; i < num ; i++) 
			scores[i] = scan.nextInt();

		for (int score : inf.solution(scores, num))
			System.out.print(score + " ");
	}
}
