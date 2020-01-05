package cf222jf_assignment4;
import java.util.*;

import cf222jf_assignment2.LinkedQueue.Node;



public class LinkedQueue<T> implements Queue<T>{
	int size;
	Node<T> head;
	Node<T> tail;

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.size == 0;
	}

	@Override
	public void enqueue(T t) {
		if (head == null){
			head = new Node<T>(t);
			size++;
			tail = head;
		}
		else if (head.nextNode == null){
			head.nextNode = new Node<T>(t);
		tail = head.nextNode;
		size++;
		}
		else{
			Node<T> node = head;
			while (node.nextNode != null){
				node = node.nextNode;
			}
			node.nextNode = new Node<T>(t);
			tail = node.nextNode;
				size++;
			}
	}

	@Override
	public T dequeue() {
		Node<T> node = head;
		head = head.nextNode;
		size--;
		return node.content;
	}

	@Override
	public T first() {
		// TODO Auto-generated method stub
		return head.content;
	}

	@Override
	public T last() {
		// TODO Auto-generated method stub
		return tail.content;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new QueueIterator();
	}
	public String toString(){
			String string = "";
			Node<T> temp = head;
			while (head.nextNode != null){
				string = string + head.content+", ";
				head = head.nextNode;
				
			}
			string = string + head.content;
			head = temp;
			return string;
	}
	
	public class Node<T> {
		Node<T> nextNode;
		T content;
		
		public Node(T c){
			content = c;
		}
		
		
	}
	
	public class QueueIterator implements Iterator<T>{
		Node<T> currentNode = head;
		
		
		 // Returns true if tthere is another node connected to this node.
		 
		@Override
		public boolean hasNext() {
			
			return currentNode.nextNode != null;
		}

 //returns the current node and moves to the next node in the queue.

		@Override
		public T next() {
			Node<T> temp = currentNode;
			currentNode = currentNode.nextNode;
			return temp.content;
		}
		
	}
	

}
