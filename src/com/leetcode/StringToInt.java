package com.leetcode;

public class StringToInt {
    public static void main(String[] args) {
//        System.out.println(myAtoi("3.14159"));
        System.out.println(myAtoi("+-1"));
    }
    public static int myAtoi(String str) {

        String strings = str.trim();
        if(strings.length() == 0){
            return 0;
        }

        char[] chars = strings.toCharArray();
        if(chars.length == 1){
            if( chars[0] >= '0'  && chars[0] <= '9'){
                return Integer.valueOf(chars[0]-'0');
            }
            else return 0;
        }
        StringBuffer s = new StringBuffer();
        if( (chars[0] < '0' || chars[0] > '9')  && chars[0] != '-' && chars[0] != '+'){
            return 0;
        }
        boolean flag = true;
        for(int i=0;i<chars.length ; i++){
            if(i == 0){
                if(chars[i] == '-'){
                    flag=false;
                    continue;
                }
                if(chars[i] == '+'){
                    continue;
                }
            }
            if( chars[i] >= '0'  && chars[i] <= '9'){
                s.append(chars[i]);
            }
            if( chars[i] < '0' || chars[i] > '9')
                break;
        }
        if(flag && !s.equals("+") && !s.equals("-") && s.length() >0 )
            try {
                return Integer.valueOf(s.toString());
            }catch (Exception e){
                return 2147483647;
            }

        else if( !s.equals("+") && !s.equals("-") && s.length() >0 )
            try {
                return Integer.valueOf(s.toString())*-1;
            }catch (Exception e){
                return -2147483648;
            }
        else
            return 0;
    }
}