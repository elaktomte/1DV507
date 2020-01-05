package cf222jf_assignment2;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class LinkedQueueTest {
	/*
	 * public int size();                     // current queue size 
	   public boolean isEmpty();              // true if queue is empty 
	   public void enqueue(Object element);   // add element at end of queue 
	   public Object dequeue();               // return and remove first element. 
	   public Object first();                 // return (without removing) first element 
	   public Object last();                  // return (without removing) last element 
	   public String toString();              // return a string representation of the queue content
	   public Iterator<Object> iterator();    // element iterator
	 */

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSize(){
		LinkedQueue queue = new LinkedQueue();
		queue.enqueue("1");
		queue.enqueue("2");
		
		assertEquals(2 , queue.size());
		
	}
	@Test
	public void testIsEmpty(){
		LinkedQueue queue = new LinkedQueue();
		queue.enqueue("1");
		queue.enqueue("2");
		
		assertFalse(queue.isEmpty());
	}
	@Test
	public void testEnqueue(){
		LinkedQueue queue = new LinkedQueue();
		queue.enqueue("1");
		
		assertEquals("1",queue.last().toString());
		
	}
	@Test
	public void testDequeue(){
		LinkedQueue queue = new LinkedQueue();
		queue.enqueue("1");
		queue.enqueue("2");
		assertEquals("1",queue.dequeue().toString());
		
		assertEquals("2", queue.first().toString());
		
	}
	@Test
	public void testFirst(){
		LinkedQueue queue = new LinkedQueue();
		queue.enqueue("1");
		queue.enqueue("2");
		assertEquals("1", queue.first().toString());
		
	}
	@Test
	public void testLast(){
		LinkedQueue queue = new LinkedQueue();
		queue.enqueue("1");
		queue.enqueue("2");
		assertEquals("2",queue.last().toString());
	}
	@Test
	public void testToString(){
		LinkedQueue queue = new LinkedQueue();
		queue.enqueue("1");
		queue.enqueue("2");
		assertEquals("1, 2" , queue.toString());
		
	}
	@Test
	public void testIterator(){
		LinkedQueue queue = new LinkedQueue();
		queue.enqueue("1");
		queue.enqueue("2");
		queue.enqueue("3");
		queue.enqueue("4");
		Iterator itr = queue.iterator();
		assertEquals("1" , itr.next().toString());
		assertEquals("2" , itr.next().toString());
		assertEquals("3" , itr.next().toString());
		assertEquals("4" , itr.next().toString());
		
		}
		
	}


