package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class plus_one {
    public int[] plusOne(int[] digits) {
        List<Integer> digitList = new ArrayList<>();
        digits[digits.length - 1] += 1; // 배열의 마지막 숫자에 1 더함
        
        digitList = sort(digits, 1, 0, digitList);
        Collections.reverse(digitList);
        
        return digitList.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public List<Integer> sort(int[] digits, int idx, int carry, List<Integer> digitList) {
        int targetIdx = digits.length - idx++;
        if (targetIdx < 0) {
            if (carry > 0) {
                digitList.add(carry);
            }
            return digitList;
        }
        digits[targetIdx] += carry;
        digitList.add(digits[targetIdx] % 10);
        return sort(digits, idx, digits[targetIdx] / 10, digitList);
    }
    
}
