import java.util.*;
import java.lang.*;

public class inf_2_10 {
/*
	public Integer solution(int[][] inputs, int num) {
		int answer = 0;

		for (int i = 1 ; i < num - 1; i++) {
			for (int j = 1; j < num -1 ; j++) {
				if(inputs[i][j] > inputs[i][j-1] && inputs[i][j] > inputs[i][j+1] && inputs[i][j] > inputs[i-1][j] && inputs[i][j] > inputs[i+1][j])
					answer++;
			}
		}

		return answer;
	}
*/

	// 방향을 잡고 하는 것이 더 좋다!
	public Integer solution(int[][] inputs, int num) {
		int answer = 0;
		// 4방향에 대한 좌표 값 지정
		int[] dx = {-1, 0 , 1, 0};
		int[] dy = {0, 1, 0, -1};

		for (int i = 1; i < num - 1 ; i++) {
			for (int j = 1 ; j < num - 1; j++) {
				boolean value = true;
				// 방향에 대한 좌표를 지정을 해준 뒤 적용
				for (int k = 0 ; k < 4; k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];

					if (inputs[nx][ny] >= inputs[i][j]) {
						value = false;
						// 자신보다 큰 값이 있으면 더 볼 필요가 없다.
						break;
					}
				}
				if (value) 
					answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		inf_2_10 inf = new inf_2_10();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		num += 2;
		int[][] inputs = new int[num][num];

		for (int i = 1 ; i < num - 1  ; i++) {
			for (int j = 1 ; j < num - 1  ; j++)
				inputs[i][j] = scan.nextInt();
		}

		System.out.print(inf.solution(inputs, num));
	}
}
