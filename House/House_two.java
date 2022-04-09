import java.util.Arrays;

public class House_two {
    public static void main(String[] args) {
//        String call = "abcabcdefabc";
        String call = "abxdeydeabz";
//        String call = "ABCabcA";
        char[] callArr = call.toCharArray();
        char[] temp = callArr;
        String[] value = {};

        Arrays.sort(callArr);

        int len = callArr.length - 1;
        int[] arr = new int[len + 1];
        int max = 1;
        int cnt = 1;
        for (int i = 0; i < len; i++) {
            if (callArr[i] == callArr[i + 1])
                arr[i] = cnt++;
            else {
                max = Math.max(cnt, max);
                arr[i] = cnt;
                cnt = 1;
            }
        }

        if (callArr[len - 1] == callArr[len])
            arr[len] = arr[len-1] + 1;
        else arr[len] = 1;

        for (int i = 0 ; i < len ; i++)
            if (arr[i] == max)
                call = call.replaceAll("(?i)"+callArr[i], "");

        System.out.println(call);
    }
}
