package com.leetcode;

import javax.swing.tree.TreeNode;

/**
 * @Author:Zhangchi
 * @date:2021-09-16 8:59 上午
 **/
public class InvertBinartTree {

    public static void main(String[] args) {

    }

    /**
     * 翻转二叉树
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {

//        invert(root);

        return invertV2(root);
    }

    public TreeNode invertV2(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode left = invertV2(root.left);
        TreeNode right = invertV2(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public void invert(TreeNode root){
        // 终结条件
        if(root == null){
            return;
        }
        // 向下深入
        invert(root.left);
        invert(root.right);

        //翻转
        TreeNode temp = new TreeNode();
        temp = root.left;
        root.left = root.right;
        root.right = temp;
    }




    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
