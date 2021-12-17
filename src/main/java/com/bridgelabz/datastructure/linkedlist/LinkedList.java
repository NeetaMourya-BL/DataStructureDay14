package com.bridgelabz.datastructure.linkedlist;
//Java program to implement
//a Singly Linked List
import java.io.*;

//Class 1
//Helper Class (Generic node class for LinkedList)
class Node<T> {

// Data members
// 1. Storing value of node
T data;
// 2. Storing address of next node
Node<T> next;

// Parameterized constructor to assign value
Node(T data)
{

   // This keyword refers to current object itself
   this.data = data;
   this.next = null;
}
}
//Main Class
public class LinkedList {

// main method
public static void main(String[] args)
{
	System.out.println("Welcome message in datastructure linked list prog");
	}
}