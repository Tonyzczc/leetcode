package com.leetcode;


public class PalindromicSubString {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("bb"));
        System.out.println(longestPalindrome("ac"));
        System.out.println(longestPalindrome("abcba"));
    }

    public static  String longestPalindrome(String s) {
        int size = 0;
        String strings = "";
        int length = s.length();
        if(s.length() == 1){
            return s;
        }
        for(int i=0;i<length ; i++){
            for(int j=i+1 ; j<length ; j++){
                String strs = isPalindromicSubString(s.substring(i,j+1).toCharArray());
                if(!strs.equals("") && strs.length() > size){
                    strings = strs;
                    size = strs.length();
                }
            }
        }
        return strings;
    }

    public static String isPalindromicSubString(char[] sChar){
        boolean flag = true;
        int length = sChar.length;
        for (int i=0;i<sChar.length/2 ;i++){
            if(sChar[i] != sChar[length-i-1]){
                flag=false;
            }
        }
        if(length == 2  && !flag){
            return sChar[0]+"";
        }

        if(flag)
            return new String(sChar);

        return "";
    }


}
