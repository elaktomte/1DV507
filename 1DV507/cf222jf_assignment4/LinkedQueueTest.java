package cf222jf_assignment4;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;


public class LinkedQueueTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSize(){
		LinkedQueue<String> queue = new LinkedQueue<String>();
		queue.enqueue("1");
		queue.enqueue("2");
		
		assertEquals(2 , queue.size());
		
	}
	@Test
	public void testIsEmpty(){
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		queue.enqueue(1);
		queue.enqueue(2);
		
		assertFalse(queue.isEmpty());
	}
	@Test
	public void testEnqueue(){
		LinkedQueue<String> queue = new LinkedQueue<String>();
		queue.enqueue("1");
		
		assertEquals("1",queue.last().toString());
		
	}
	@Test
	public void testDequeue(){
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		queue.enqueue(1);
		queue.enqueue(2);
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
		LinkedQueue<String> queue = new LinkedQueue<String>();
		queue.enqueue("1");
		queue.enqueue("2");
		assertEquals("2",queue.last().toString());
	}
	@Test
	public void testToString(){
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		queue.enqueue(1);
		queue.enqueue(2);
		assertEquals("1, 2" , queue.toString());
		
	}
	@Test
	public void testIterator(){
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		Iterator itr = queue.iterator();
		assertEquals("1" , itr.next().toString());
		assertEquals("2" , itr.next().toString());
		assertEquals("3" , itr.next().toString());
		assertEquals("4" , itr.next().toString());
		
		}
}
