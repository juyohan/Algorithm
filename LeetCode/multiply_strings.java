package LeetCode;

import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.List;

class multiply_strings {
    static int num2Lt;
    static List<String> answerList;
        
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) 
            return "0";
        
        String zero = "";
        answerList = new ArrayList<>();
        
        for (int i = num1.length() - 1 ; i >= 0 ; i--) {
            num2Lt = num2.length() - 1;
            getOneMulti(num1.charAt(i) - '0', num2, 0, zero);
            zero += "0";
        }
    
        String result = "";    
        for (int i = 0 ; i < answerList.size() ; i++) {
            result = sumTwoNumber(result, answerList.get(i));
        }
        
        for (String answer : answerList) {
            System.out.println(answer);
        }
                
        return new StringBuilder(result).reverse().toString();
    }
    
    public String sumTwoNumber(String result, String val) {
        int carry = 0, val1 = 0, val2 = 0, sum = 0;
        String temp = "";
        
        for (int i = 0 ; i < result.length() || i < val.length() ; i++) {
            val1 = i < result.length() ? result.charAt(i) - '0' : 0;
            val2 = i < val.length() ? val.charAt(i) - '0' : 0;
            sum = val1 + val2 + carry;
            carry = sum / 10;
            temp += (sum % 10);
        }
        
        if (carry > 0) temp += carry;
        return temp;
    }
    
    public void getOneMulti(int num1, String num2, int carry, String answer) {
        if (num2Lt < 0) {
            if (carry > 0)
                answer += carry;
            answerList.add(answer.toString());
            return ;
        }
        
        int val2 = num2.charAt(num2Lt) - '0';
        
        int multi = (num1 * val2) + carry;
        num2Lt -= 1;
        getOneMulti(num1, num2, multi / 10, answer += (multi % 10));
    }
}