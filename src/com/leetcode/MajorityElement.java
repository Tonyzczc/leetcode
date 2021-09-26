package com.leetcode;

import java.util.Arrays;

/**
 * 多数元素
 * @Author:Zhangchi
 * @date:2021-09-24 9:24 上午
 **/
public class MajorityElement {

    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
