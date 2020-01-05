package cf222jf_assignment2;

import java.util.Iterator;
/** A class which creates a Linked Queue with Nodes and Iterator.
 * 
 * 
 * 
 * @author Christian och Frida
 *
 */
public class LinkedQueue implements Queue{
private int size;
private Node head;
private Node tail;

	public LinkedQueue(){
		size = 0;
	}
	
	@Override
	public int size() {
		
		return size;
	}
/**
 * returns true if there are no elements in this queue.
 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}
/**
 * adds an element to the queue.
 */
	@Override
	public void enqueue(Object element) {
		if (head == null){
			head = new Node(element);
			size++;
			tail = head;
		}
		else if (head.nextNode == null){
			head.nextNode = new Node(element);
		tail = head.nextNode;
		size++;
		}
		else{
			Node node = head;
			while (node.nextNode != null){
				node = node.nextNode;
			}
			node.nextNode = new Node(element);
			tail = node.nextNode;
				size++;
			}
		}
	
/**
 * returns the and removes the first node.
 */
	@Override
	public Object dequeue() {
		Node node = head;
		head = head.nextNode;
		size--;
		return node;
	}
/**
 * returns the first node.
 */
	@Override
	public Object first() {
		// TODO Auto-generated method stub
		return head;
	}
/**
 * returns the last node.
 */
	@Override
	public Object last() {
		// TODO Auto-generated method stub
		return tail;
	}
	public String toString(){
		String string = "";
		Node temp = head;
		while (head.nextNode != null){
			string = string + head.element+", ";
			head = head.nextNode;
			
		}
		string = string + head.element;
		head = temp;
		return string;
	}
/**
 * creates an iterator for the queue.
 */
	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return new QueueIterator();
	}
	
	/**
	 * An Iterator for the Queue.
	 * @author Christian och Frida
	 *
	 */
	public class QueueIterator implements Iterator{
		Node currentNode = head;
		
		/**
		 * Returns true if tthere is another node connected to this node.
		 */
		@Override
		public boolean hasNext() {
			
			return currentNode.nextNode != null;
		}
/**
 * returns the current node and moves to the next node in the queue.
 */
		@Override
		public Object next() {
			Node temp = currentNode;
			currentNode = currentNode.nextNode;
			return temp;
		}
		
	}
	/**
	 * A class the handles the nodes in the linked queue.
	 * @author Christian och Frida
	 *
	 */
	public class Node { // Node class
		Object element;
		Node nextNode;
		
		/**
		 * Creates a node with the object.
		 * @param
		 * 
		 */
		public Node(Object element){
			this.element = element;
			
			
		}
		/**
		 * Returns a string representation of the nodes queued.
		 */
		public String toString(){
			String string = ""+element;
			return string;
		}
		
		
	}
	
}


