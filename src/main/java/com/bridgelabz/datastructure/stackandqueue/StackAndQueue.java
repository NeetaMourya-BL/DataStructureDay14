package com.bridgelabz.datastructure.stackandqueue;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.*;

public class StackAndQueue {
	public static void main(String args[]) {
		// creating an object of Stack class
		Stack<Integer> stk = new Stack<>();
		System.out.println("stack: " + stk);
		// pushing elements into the stack
		add(stk, 56);
		add(stk, 30);
		add(stk, 70);
		// popping elements from the stack
		popelmnt(stk);
		popelmnt(stk);
		// throws exception if the stack is empty
		try {
			popelmnt(stk);
		} catch (EmptyStackException e) {
			System.out.println("empty stack");
		}
		StackAndQueue queue = new StackAndQueue();
		queue.peek();
		queue.queue();
		queue.deque();
	}

	// performing push operation
	static void add(Stack stk, int x) {
		// invoking push() method
		stk.push(new Integer(x));
		System.out.println("push -> " + x);
		// prints modified stack
		System.out.println("stack: " + stk);
	}

	// performing pop operation
	static void popelmnt(Stack stk) {
		System.out.print("pop -> ");
		// invoking pop() method
		Integer x = (Integer) stk.pop();
		System.out.println(x);
		// prints modified stack
		System.out.println("stack: " + stk);
	}

	public void peek() {
		Stack<String> stk = new Stack<>();
		// pushing elements into Stack
		stk.push("56");
		stk.push("30");
		stk.push("72");
		System.out.println("Stack: " + stk);
		// Access element from the top of the stack
		String fruits = stk.peek();
		// prints stack
		System.out.println("Element at top: " + fruits);
	}

	public void queue() {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("56");
		queue.add("30");
		queue.add("70");
		System.out.println("head:" + queue.element());
		System.out.println("head:" + queue.peek());
		System.out.println("iterating the queue elements:");
		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

	public void deque() {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("56");
		deque.add("30");
		deque.add("70");
		// Traversing elements
		for (String str : deque) {
			System.out.println("Deque list:" + str);
		}
	}
}