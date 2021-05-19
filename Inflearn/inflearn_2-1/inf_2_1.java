import java.util.*;

public class inf_2_1 {
	public ArrayList<Integer> solution(int[] str, int index){
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(str[0]);

		for (int i = 1 ; i < index ; i++) {
			if (str[i] > str[i-1])
				answer.add(str[i]);	
		}

		return answer;
	}

	public static void main(String[] args) {
		inf_2_1 inf = new inf_2_1();
		int num;

		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		int[] answer = new int[num];

		for (int i = 0 ; i < num ; i++) 
			answer[i] = scan.nextInt();

		for (int k : inf.solution(answer,num))
			System.out.print(k + " ");
	}
}
