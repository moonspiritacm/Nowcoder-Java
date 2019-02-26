package com.moonspirit.nowcoder;

import java.util.Stack;

/**
 * @ClassName      Solution005
 * @Description    剑指 offer - 用两个栈实现队列
 * @author         moonspirit
 * @date           2019年2月26日 上午10:28:03
 * @version        1.0.0
 */
public class Solution005 {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		stack1.push(node);
	}

	public int pop() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
}
