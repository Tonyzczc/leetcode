package com.leetcode.stack;

import java.util.Stack;

/**
 * @Author:Zhangchi
 * @date:2021-09-08 11:01 下午
 **/
public class IsValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));

    }
    public static boolean isValid(String s) {
        while(s.contains("()") ||s.contains("{}")||s.contains("[]")){
            s = s.replace("{}","");
            s = s.replace("()","");
            s = s.replace("[]","");
        }
        return s.equals("");
    }



    public static boolean isValidV2(String s) {
        Stack<Character> par = new Stack();
        for(char c : s.toCharArray()){
            if(c == '('){
                par.push(')');
            }else if(c == '{'){
                par.push('}');
            }else  if (c == '['){
                par.push(']');
            }else if(par.isEmpty() || c != par.pop()){
                return false;
            }
        }
        return par.isEmpty();
    }

    public static boolean isValidV1(String s) {
        Stack<Character> par = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                par.push(s.charAt(i));
            }else{
                if(par.isEmpty()){
                    return false;
                }
                char popChar = par.pop();
                switch (popChar) {
                    case '(' :{
                        if(s.charAt(i) != ')'){ return false;}
                    } break;
                    case '{' :{
                        if(s.charAt(i) != '}'){ return false;}
                    } break;
                    case '[' :{
                        if(s.charAt(i) != ']'){ return false;}
                    } break;
                }
            }
        }
        if(par.isEmpty()){
            return true;
        }
        return false;
    }
}
