import java.util.*;

class inf_05_8_Person {
	int id;
	int value;

	public inf_05_8_Person(int id, int value) {
		this.id = id;
		this.value = value;
	}
}

public class inf_05_8 {
	public Integer solution(int select, int[] status) {
		int answer = 1;
		Queue<inf_05_8_Person> queue = new LinkedList<>();

		for (int i = 0 ; i < status.length ; i++)
			queue.offer(new inf_05_8_Person(i, status[i]));

		while (!queue.isEmpty()) {
			// 비교할 대상을 꺼내옴
			inf_05_8_Person p = queue.poll();
			// 큐에 들어있는 값들과 하나씩 비교함
			for (inf_05_8_Person x : queue) {
				// 비교할 대상의 값보다 큐에 들어있는 값이 클 경우
				if (p.value < x.value) {
					// 비교할 대상을 다시 큐에 넣음
					queue.offer(p);
					// 그리고 비교할 대상을 없앰
					p = null;
					// 다시 비교할 대상을 가져오기 위함
					break;
				}
			}
			// 가장 큰 값일 경우 p에 값은 존재
			if (p != null) {
				if (p.id == select)
					return answer;
				else 
					answer++;
			}
		}

		return answer;
	}

	public static void main(String[] argc) {
		inf_05_8 inf058 = new inf_05_8();
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int select = scan.nextInt();

		int status[] = new int[num];
		for (int i = 0 ; i < num ; i++)
			status[i] = scan.nextInt();

		System.out.println(inf058.solution(select, status));
	}
}
