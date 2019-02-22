package com.leetcode;

/**
 * 字符串分割 可以的，以后可以split("\\|")分割，因为"|"是java中的特殊字符
 */
public class Test {
    public static void main(String[] args) {
        String s = "&|<|>|%3c|%3e\n" +
                "&amp;|&lt;|&gt;|&lt;|&gt;";
        String s1[] = s.split("\\|");
        for(String str : s1){
            System.out.println(str+"---"+converString(str));
        }
    }

    public static String converString(String str){
        str = str.replace("&", "&amp;");
        str = str.replace("<", "&lt;");
        str = str.replace(">", "&gt;");
        str = str.replace("'", "&#039;");
        return str;
    }
}
