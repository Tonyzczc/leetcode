package com.leetcode;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 *
 * @author zhangchi
 * */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] num = {0,1,0,3,12};
        int[] nums = {0,0,1};
        moveZeroesV2(num);
        moveZeroesV2(nums);


        for(int i : num){
            System.out.print(i+"-");
        }
        System.out.println();
    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.6 MB, 在所有 Java 提交中击败了51.48%的用户
     * @param nums
     */
    public static void moveZeroesV2(int[] nums) {
        int[] num = nums;
        int index = 0;
        for(int i=0 ; i<num.length ; i++){
            if(num[i] != 0){
                nums[index] = num[i];
                index++;
            }
        }
        for(; index < nums.length ; index++){
            nums[index] = 0;
        }
    }

    /**
     * 执行用时： 5 ms , 在所有 Java 提交中击败了 9.94% 的用户
     * 内存消耗： 38.3 MB , 在所有 Java 提交中击败了 93.51% 的用户
     * @param nums
     */
    public static void moveZeroesV1(int[] nums) {
        int zeroIndex = 0 ;
        for(int i = nums.length-1 ; i >= 0 ; i--){
            if(nums[i] != 0){
                zeroIndex = i;
                break;
            }
        }
        for(int numIndex = 0 ; numIndex <= zeroIndex ; ){
            if(nums[numIndex] == 0){
                for(int i = numIndex ; i<zeroIndex ; i++){
                    nums[i] = nums[i+1];
                }
                nums[zeroIndex] = 0;
                zeroIndex -- ;
            }
            if(nums[numIndex] != 0 ){
                numIndex++;
            }
        }
        for(int i : nums){
            System.out.print(i+"-");
        }
        System.out.println();

    }

}
