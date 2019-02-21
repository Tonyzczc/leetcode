package com.leetcode;

/**
 * 回文数 判断
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        if(x >0 && x<10)
            return true;
        String s = String.valueOf(x);
        char[] chars    = s.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=chars.length-1;i>= 0;i--){
            stringBuffer.append(chars[i]);
        }
        String c= String.valueOf(stringBuffer.toString());
        if(c.equals(s))
            return true;
        return false;
    }
}
