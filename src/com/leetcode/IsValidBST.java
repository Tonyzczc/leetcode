package com.leetcode;

/**
 * @Author:Zhangchi
 * @date:2021-09-22 3:57 下午
 **/
public class IsValidBST {
    public static void main(String[] args) {

    }
    /**
     *  左  右
     *  当前节点是否大于中序遍历的前一个节点
     */
    long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        if(!isValidBST(root.left)){
            return false;
        }
        if(root.val <= pre){
            return false;
        }
        pre = root.val;
        if(!isValidBST(root.right)){
            return false;
        }
        return true;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


}
