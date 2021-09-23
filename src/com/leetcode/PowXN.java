package com.leetcode;

/**
 * @Author:Zhangchi
 * @date:2021-09-23 10:10 上午
 **/
public class PowXN {

    public static void main(String[] args) {
        System.out.println(myPow(0.00001,2147483647));
    }

    /**
     * 递归  x  = x/2 * x/2
     * @param x
     * @param n
     * @return
     */
    public static double myPow(double x, int n) {
        return n >0 ? calculate(x, n) : 1.0/calculate(x, -n);
    }

    public static double calculate(double x, int n){
        if(n == 0){
            return 1.0;
        }
        double y =  calculate(x, n/2);
        if(n%2 == 0){
            return y * y;
        }else{
            n = n-1;
            return y * y * x;
        }
    }

    public static double myPowTimeOut(double x, int n) {
        double res = 1.0;
        if(n > 0 ) {
            for (int i = 0; i < n; i++) {
                res *= x;
            }
        }else{
            n = n*-1;
            for (int i = 0; i < n; i++) {
                res *= x;
            }
            res = 1/res;
        }

        return  res;
    }
}
