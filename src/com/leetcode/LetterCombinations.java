package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 17. 电话号码的字母组合
 * @Author:Zhangchi
 * @date:2021-09-26 9:25 上午
 **/
public class LetterCombinations {

    public static void main(String[] args) {
        List<String> strings = letterCombinations("23");
        for(String s : strings){
            System.out.println(s);
        }
    }


    public static List<String> letterCombinations(String digits) {
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};

        List<String> ans = new ArrayList();
        if (digits.length() == 0) {
            return ans;
        }
        backtrack(ans , new StringBuffer() , phoneMap , 0 , digits);
        return ans;
    }

    public static void backtrack(List<String> ans , StringBuffer answer ,
                                 Map<Character, String> phoneMap ,
                                 int index , String digits  ){
        // 递归条件
        if(digits.length() == index){
            ans.add(answer.toString());
            return;
        }
        char character = digits.charAt(index);
        String s = phoneMap.get(character);
        int length = s.length();
        for(int i=0 ; i<length ; i++){
            answer = answer.append(s.charAt(i));
            backtrack(ans, answer, phoneMap, index+1, digits);
            answer.deleteCharAt(index);
        }

    }
}
