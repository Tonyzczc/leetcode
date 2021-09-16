package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Zhangchi
 * @date:2021-09-16 12:50 下午
 **/
public class GenerateParenthesis {

    public static void main(String[] args) {
        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
        generateParenthesis.generateParenthesis(3);
    }


    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateParenthe(0 , 0 , n , "" , res);
        return res;
    }

    private void generateParenthe(int left , int right, int number, String str , List<String> result) {

        if(left == number && right == number ){
            result.add(str);
            return;
        }
        if(left < number ) {
            String s1 = str + "(";
            generateParenthe(left + 1, right, number, s1, result);
        }
        //  (数量 > )数量
        if(left > right) {
            String s2 = str + ")";
            generateParenthe(left, right + 1, number, s2, result);
        }


    }

}
