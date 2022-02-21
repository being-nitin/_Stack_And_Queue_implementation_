package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        /*
        It implements the first in last out and last in first out data structure.
        By default it only removes the top element.
        For insertion and deletion we have push ans pop method.
        And peek element will show the top most element.
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
    }
}
