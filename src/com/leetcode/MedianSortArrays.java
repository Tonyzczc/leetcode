package com.leetcode;

import java.util.ArrayList;
import java.util.Comparator;

public class MedianSortArrays {
    public static void main(String[] args) {
        int[] num1 = {1,2};
        int[] num2 = {3,4};
        System.out.println(findMedianSortedArrays(num1,num2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> lists = new ArrayList<Integer>(nums1.length + nums2.length);
        for(int i=0;i<nums1.length ; i++){
            lists.add(nums1[i]);
        }
        for(int i=0;i<nums2.length ; i++){
            lists.add(nums2[i]);
        }
        lists.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 >= o2){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        int index = lists.size()/2;
        if( lists.size() % 2 ==0){
            return (double)(lists.get(index-1) + lists.get(index))/2;
        }else{
            return (double)lists.get(index);
        }

    }
}
