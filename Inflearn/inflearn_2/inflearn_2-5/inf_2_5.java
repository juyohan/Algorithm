import java.util.*;

public class inf_2_5 {
	public int solution(int count){
		int answer = 0;
		// 만약 값이 20이 들어오면 20까지 확인을 해야하는데 배열은 19까지 만들어지므로 +1을 해줘야한다.
		int[] index = new int[count+1];

		// 2부터 체크한다.
		for (int i = 2; i <= count ; i++) {
			if (index[i] == 0) {
				// 해당 배열의 배수들을 다 체크해줌
				for (int j = i ; j <= count ; j += i) 
					index[j] = 1;
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		inf_2_5 inf = new inf_2_5();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		System.out.print(inf.solution(num));
	}
}
