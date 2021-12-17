package com.bridgelabz.datastructure.stackandqueue;
import java.util.EmptyStackException;
import java.util.Stack;  
public class StackAndQueue { 
	public static void main(String args[])   
	{  
	//creating an object of Stack class  
	Stack <Integer> stk = new Stack<>();  
	System.out.println("stack: " + stk);  
	//pushing elements into the stack  
	add(stk, 56);  
	add(stk, 30);  
	add(stk, 70);  
	//popping elements from the stack  
	popelmnt(stk);  
	popelmnt(stk);  
	//throws exception if the stack is empty  
	try   
	{  
	popelmnt(stk);  
	}   
	catch (EmptyStackException e)   
	{  
	System.out.println("empty stack");  
	}  
	StackAndQueue queue=new StackAndQueue();
	queue.peek();
	}  
	//performing push operation  
	static void add(Stack stk, int x)   
	{  
	//invoking push() method      
	stk.push(new Integer(x));  
	System.out.println("push -> " + x);  
	//prints modified stack  
	System.out.println("stack: " + stk);  
	}  
	//performing pop operation  
	static void popelmnt(Stack stk)   
	{  
	System.out.print("pop -> ");  
	//invoking pop() method   
	Integer x = (Integer) stk.pop();  
	System.out.println(x);  
	//prints modified stack  
	System.out.println("stack: " + stk);  
	}  
	public void peek() {
	Stack<String> stk= new Stack<>();  
	// pushing elements into Stack  
	stk.push("56");  
	stk.push("30");  
	stk.push("72");  
	System.out.println("Stack: " + stk);  
	// Access element from the top of the stack  
	String fruits = stk.peek();  
	//prints stack  
	System.out.println("Element at top: " + fruits);  
	}
	}  