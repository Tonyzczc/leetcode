package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Zhangchi
 * @date:2021-09-15 9:45 上午
 **/
public class NTreePostorderTraversal {

    public static void main(String[] args) {

    }

    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        postorderTraversal(root,result);
        return  result;
    }

    /**
     * 数的后序遍历   左 右 跟
     * @param root
     * @param result
     */
    public void postorderTraversal(Node root , List<Integer> result){
        //递归结束条件
        if(root == null){
            return;
        }
        for(Node children : root.children){
            postorderTraversal(children,result);
        }
        result.add(root.val);

    }


    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
