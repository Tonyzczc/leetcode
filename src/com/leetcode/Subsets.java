package com.leetcode;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Zhangchi
 * @date:2021-09-23 3:32 下午
 **/
public class Subsets {

    /**
     * 78. 子集
     */

    public static void main(String[] args) {
        int[] num = {1 , 2 , 3};
        List<List<Integer>> sub = subsetsFor(num);
        for(List<Integer> s : sub){
            System.out.println(s);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums == null){return ans;}
        subSetABS(ans, nums, 0, new ArrayList<>());
        return ans;
    }

    public static List<List<Integer>> subsetsFor(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null) {
            return ans;
        }
        ans.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> subList = new ArrayList<>();
            for (List<Integer> sub : ans) {
                List<Integer> subSubber = new ArrayList<>(sub);
                sub.add(nums[i]);
                subList.add(subSubber);
            }
            ans.addAll(subList);
        }
        return ans;
    }

    public void subSetABS(List<List<Integer>> ans , int[] nums , int index , List<Integer> list){
        // 数组末层
        if(nums.length == index){
            ans.add(new ArrayList(list));
            return ;
        }

        // 不选
        subSetABS(ans, nums, index+1, list);
        // 选择
        list.add(nums[index]);
        subSetABS(ans, nums, index+1, list);

        list.remove(list.size() -1 );
    }




}
