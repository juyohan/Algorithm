public class ssg_1 {
    //    static int hour = 0;
    public static int[] v;
    public static int[] tmp;
    public static void main(String[] args) {
        v = new int[]{4, 5, 5};
        int a = 2, b = 1;

        tmp = new int[v.length];

//        Integer[] arr = Arrays.stream(v).boxed().toArray(Integer[]::new);
//        for (int s : v)
//            max = Math.max(max, s);

        int answer = solution(a, b, 0);
        System.out.println(answer);
    }

    public static void mergeSort(int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort( start, mid);
            mergeSort( mid + 1, end);

            int p = start;
            int q = mid + 1;
            int idx = p;

            while (p <= mid || q <= end) {
                if (q > end || (p <= mid && v[p] < v[q])) tmp[idx++] = v[p++];
                else tmp[idx++] = v[q++];
            }

            for (int i = start ; i <= end; i++)
                v[i] = tmp[i];
        }
    }

    public static int solution(int a, int b, int hour) {
        mergeSort(0, v.length - 1);

        for (int i = 0; i < v.length; i++) {
            if (i == v.length - 1) v[i] -= a;
            else v[i] -= b;

            if (v[i] < 0) return hour;
        }

        return solution(a, b, hour + 1);
    }

//    public static void solution(Integer[] arr, int a, int b) {
//        Arrays.sort(arr, Collections.reverseOrder());

//        for (int i = 0 ; i < arr.length ; i++) {
//            if (i == 0) arr[i] -= a;
//            else arr[i] -=b;
//            if (arr[i] < 0) return;
//        }
//
//        hour++;
//        solution(arr, a, b);
//    }
}
