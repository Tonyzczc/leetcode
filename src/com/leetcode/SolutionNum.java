package com.leetcode;

public class SolutionNum {
    public static void main(String[] args) {
//        System.out.println(reverse(123));
//        System.out.println(reverse(120));
//        System.out.println(reverse(-123));
//        System.out.println(reverse(0));
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        if(x <10 && x >-9){
            return x;
        }
        boolean type = true; //正数
        if(x < 0 ){
            type=false;
            x=x*-1;
        }
        String str = String.valueOf(x);
        char[] chars = str.toCharArray();
        boolean flag = true;    // 标记末尾为0
        StringBuffer buffer  = new StringBuffer();
        for(int i=chars.length-1 ; i>=0 ;i--){
            if(chars[i] != '0'){
                flag = false;
            }
            if(!flag){
                buffer.append(chars[i]);
            }
        }
        if(type)
            try {
                return Integer.valueOf(buffer.toString());
            }catch (Exception e){
                return 0;
            }
        else
            try {
                return Integer.valueOf(buffer.toString())*-1;
            }catch (Exception e){
                return 0;
            }

    }
}
