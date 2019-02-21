package com.leetcode;

public class MostWater {
    public static void main(String[] args) {
        int[] n = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(n));
    }

    public static int maxArea(int[] height) {
        int maxarea = 0;
        int l = 0;
        int r = height.length-1;
        while(l < r){
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }


        return maxarea;
    }
}
