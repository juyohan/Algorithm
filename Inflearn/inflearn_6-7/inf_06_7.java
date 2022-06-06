package PACKAGE_NAME;

import java.util.*;

/* Comparable을 사용
class Point implements Comparable<Point> {
	public int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 정렬을 어떤걸로 기준을 할 지 정해주는 메소드
	@Override
	public int compareTo(Point p) {
		if (this.x == p.x)
			return this.y - p.y;
		else
			return this.x - p.x;
	}
}
*/

// Comparator을 사용
class Inf_06_7_Point {
	public int x, y;

	Inf_06_7_Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class MyComparator implements Comparator<Inf_06_7_Point> {
	@Override
	public int compare(Inf_06_7_Point p1, Inf_06_7_Point p2) {
		if (p1.x == p2.x)
			return Integer.compare(p1.y, p2.y);
		else
			return Integer.compare(p1.x, p2.x);
	}
}


public class inf_06_7 {
	public static int[][] solution(int size, int[][] location) {

		// Comparator 클래스를 사용해 compare의 메소드를 가지고 비교한다.
		// 간략화 한 코드
/*		Arrays.sort(location, (a, b) -> {
			if (a[0] == b[0])
				return Integer.compare(a[1], b[1]);
			else
				return Integer.compare(a[0], b[0]);
		});
*/

		// 이게 원조 코드
		Arrays.sort(location, new Comparator<int[]>() {
			@Override
			public int compare(int[] a1 , int[] a2) {
				if (a1[0] == a2[0])
					return a1[1] - a2[1];
				else
					return a1[0] - a2[0];
			}
		});
		return location;
	}

	public static void main(String[] argc) {
		Scanner scan = new Scanner(System.in);


		int size = scan.nextInt();
/*
		int[][] location = new int[size][2];

		for (int i = 0 ; i < size ; i++) {
			for (int j = 0 ; j < 2 ; j++) {
				location[i][j] = scan.nextInt();
			}
		}

		for (int[] k : main.solution(size, location)) {
			for (int l : k) 
				System.out.print(l + " ");
			System.out.println("");
		}
*/
		ArrayList<Inf_06_7_Point> point = new ArrayList<>();
		for (int i = 0 ; i < size ; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			point.add(new Inf_06_7_Point(x, y));
		}
		MyComparator com = new MyComparator();
		Collections.sort(point, com);
//		Collections.sort(point);
		for (Inf_06_7_Point o : point)
			System.out.print(o.x + " " + o.y + "\n");
	}
}
