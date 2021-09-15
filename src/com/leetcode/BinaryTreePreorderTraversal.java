package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Zhangchi
 * @date:2021-09-15 9:26 上午
 **/
public class BinaryTreePreorderTraversal {

    public static void main(String[] args) {

    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderTraversal(root, result);
        return result;
    }

    /**
     * 二叉树前序遍历   跟-左-右
     * @param root
     * @param result
     */
    public static void  preorderTraversal(TreeNode root , List<Integer> result){
        // 递归结束语句
        if(root == null){
            return;
        }

        // 根节点
        result.add(root.val);
        //左右子树循环
        preorderTraversal(root.left , result);
        preorderTraversal(root.right,result);
    }


    public class TreeNode {
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
