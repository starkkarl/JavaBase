package com.star.linkedlist03;

import java.util.Stack;

//演示栈stack的基本使用
public class TestStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        //入栈
        stack.add("jack");
        stack.add("tom");
        stack.add("smith");

        //出栈
        while(stack.size() > 0){
            System.out.println(stack.pop());//pop就是将栈顶的数据取出
        }

    }


}
