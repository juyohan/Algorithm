import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BJ_1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] strs = new String[size];

        for (int i = 0 ; i < size ; i++) {
            strs[i] = br.readLine();
        }

        for (String answer : solution(strs)) {
            System.out.println(answer);
        }
    }

    public static String[] solution(String[] strs) {
        String[] result = Arrays.stream(strs).distinct().toArray(String[]::new); // 중복제거

        Arrays.sort(result, new Comparator<String>() { // 정렬
            @Override
            public int compare(String str1, String str2) {
                if (str1.length() == str2.length()) {
                    int strIndex = 0;
                    while (true) {
                        if (str1.charAt(strIndex) == str2.charAt(strIndex)) {
                            strIndex++;
                        } else {
                            break;
                        }
                    }
                    return str1.charAt(strIndex) - str2.charAt(strIndex);
                } else {
                    return str1.length() - str2.length();
                }
            }
        });

        return result;
    }
}