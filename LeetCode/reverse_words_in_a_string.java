package LeetCode;

public class reverse_words_in_a_string {
    public String reverseWords(String s) {
        String answer = "";
        
        s = s.trim().replaceAll("\\s+", " ");
        String[] arr = s.split(" ");
        for (int i = arr.length - 1 ; i >= 0 ; i--) {
            answer += i == 0 ? arr[i] : arr[i] + " ";
        }
        
        return answer;
    }
}