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
//Class 2
//Helper class ( Generic LinkedList class)
class list<T> {

// Generic node instance
Node<T> head;
// Data member to store length of list
private int length = 0;

// Default constructor
list() 
{ this.head = null; }
//Method
// To add node at the end of List
void add(T data)
{

  // Creating new node with given value
  Node<T> temp = new Node<>(data);

  // Checking if list is empty
  // and assigning new value to head node
  if (this.head == null) {
      head = temp;
  }

  // If list already exists
  else {

      // Temporary node for traversal
      Node<T> X = head;

      // Iterating till end of the List
      while (X.next != null) {
          X = X.next;
      }

      // Adding new valued node at the end of the list
      X.next = temp;
  }

  // Increasing length after adding new node
  length++;
}
}
//Main Class
public class LinkedList {

// main method
public static void main(String[] args)
{
	System.out.println("Welcome message in datastructure linked list prog");
	 // Integer List

    // Creating new empty Integer linked list
    list<Integer> list1 = new list<>();
    System.out.println(
        "Integer LinkedList created as list1 :");
    // Adding elements to the above List object

    // Element 1 - 56
    list1.add(56);
    // Element 2 - 30
    list1.add(30);
    // Element 3 - 70
    list1.add(70);

    // Display message only
    System.out.println(
        "list1 after adding 56,30 and 70 :");

    // Print and display the above List elements
    System.out.println(list1);
	}
}