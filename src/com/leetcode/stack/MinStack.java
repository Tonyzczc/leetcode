package com.leetcode.stack;

import java.util.Stack;

/**
 * @Author:Zhangchi
 * @date:2021-09-09 9:42 上午
 **/
public class MinStack {

    Stack<Integer> data = new Stack<>();

    int min = Integer.MAX_VALUE;

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int val) {
        if(min >= val ){
            data.push(min);
            min = val;
        }
        data.push(val);

    }

    public void pop() {
        if(data.pop() == min){
            min = data.pop();
        }
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
       return min;
    }
}
