package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        /*
        It implements the first in last out and last in first out data structure.
        By default it only removes the top element.
        For insertion and deletion we have push ans pop method.
        And peek element will show the top most element.
        Stack is a class in java collection framework.
         */
        Stack <Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        /*
        Queue:
        it implements the first in first out and last in last out data structure.
        In queue you can insert the element from back and insert it from the front.
        Queue is an interface in java collection framework.
        So we can not directly make an object of it so for constructor we will use linked list.
         */
        Queue<Integer> queue = new LinkedList<>();
        queue.add(121);
        queue.add(122);
        queue.add(123);
        queue.add(124);
        queue.add(125);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
