package com.leetcode;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 * 二叉树中序遍历
 * @Author:Zhangchi
 * @date:2021-09-13 10:54 上午
 **/
public class BinaryTreeInorderTraversal {

    public static void main(String[] args) {

    }

    /**
     * 平衡二叉树遍历
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(result == null){
            return  result;
        }
        nodeIterator(root, result);

        return result;
    }

    /**
     * 二叉树中序遍历
     * @param root
     * @param result
     */
    public static void nodeIterator(TreeNode root , List<Integer> result){
        if(root == null){
            return;
        }
        nodeIterator(root.left, result);
        result.add(root.val);
        nodeIterator(root.right,result);
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
