package com.leetcode;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * @Author:Zhangchi
 * @date:2021-09-07 9:13 上午
 **/
public class ClimbStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(1));
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) {
        int counts = 0;
        int one = 1;
        int two = 1;
        if(n == 1){
            return  one;
        }
        if(n == 2){
            return two+one;
        }
        for (int i = 2; i <= n; i++) {
            counts = one+two;
            one = two;
            two = counts;
        }
        return counts;
    }
}
