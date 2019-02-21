package com.leetcode;

/**
 * 正则表达式匹配
 */
public class RegularExpressionMatching {
    public static void main(String[] args) {
        System.out.println(isMatch("aa","a"));
        System.out.println(isMatch("aa",".*"));
        System.out.println(isMatch("aab","c*a*b"));
        System.out.println(isMatch("mississippi","mis*is*p*."));
    }
    public static boolean isMatch(String s, String p) {
        return s.matches(p);
    }
}
