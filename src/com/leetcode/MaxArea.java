package com.leetcode;

/**
 * https://leetcode-cn.com/problems/container-with-most-water/
 * @Author:Zhangchi
 * @date:2021-09-06 7:58 下午
 **/
public class MaxArea {
    public static void main(String[] args) {
        int[] num =  {1,1};
        System.out.println(maxArea(num));
        int[] num2 =  {4,3,2,1,4};
        System.out.println(maxArea(num2));
        int[] num3 =  {1,2,1};
        System.out.println(maxArea(num3));
        int[] num4 =  {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(num4));

    }

    public static int maxArea(int[] height) {
        int maxArea = 0;
        // 可以计算 但是超时了
//        for(int i=0 ; i<height.length ; i++){
//            for(int j = height.length -1 ; j > i ; j--){
//                int area = (j-i) * Math.min(height[i],height[j]);
//                if(maxArea < area){
//                    maxArea = area;
//                }
//            }
//        }
        int l = 0;
        int r = height.length-1;
        while(l < r){
            int area = (r - l) * Math.min(height[l],height[r]);
            if(maxArea < area){
                maxArea = area;
            }
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;
    }
}
