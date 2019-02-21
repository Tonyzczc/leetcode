package com.leetcode;

public class LongerSubString {
    public static int lengthOfLongestSubstring(String s) {
        if (s.equals(" ") || s.length() == 1)
            return 1;
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String str = s.substring(i, j + 1);
                char[] chars = str.toCharArray();
                boolean flag = true;
                for (int k = 0; k < chars.length; k++) {
                    char c = chars[k];
                    for (int m = k + 1; m < chars.length; m++) {
                        if (c == chars[m]) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag && j - i + 1 > length) {
                    length = j - i + 1;
                }
            }
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            // set数组，用于去
            StringBuffer setString = new StringBuffer();
            for (int j = i; j < s.length(); j++) {
                if (setString.toString().contains(String.valueOf(s.charAt(j))))
                    break;
                setString.append(String.valueOf(s.charAt(j)));
            } // 判断当前字符串长度是否大于已记载的最大子串长度
            if (maxLength > setString.length()) continue;
            // 判断是否是子串而不是子序列
            if (s.contains(setString)) {
                maxLength = setString.length();
            }
        }
        return maxLength;
    }
}
