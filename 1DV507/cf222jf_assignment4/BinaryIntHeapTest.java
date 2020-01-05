package cf222jf_assignment4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class BinaryIntHeapTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGeneral() {
		BinaryIntHeap heap = new BinaryIntHeap();
		heap.insert(1);
		System.out.println(heap.toString());
		heap.insert(7);
		System.out.println(heap.toString());
		heap.insert(12);
		System.out.println(heap.toString());
		heap.insert(19);
		System.out.println(heap.toString());
		heap.insert(2);
		System.out.println(heap.toString());
	
		System.out.println("-------");
		
		System.out.println(heap.pullHighest());
		System.out.println(heap.toString());
		System.out.println(heap.pullHighest());
		System.out.println(heap.toString());
		
		assertEquals(3, heap.size());
		assertFalse(heap.isEmpty());
		
		
	}

}
