package cf222jf_assignment2;

import java.util.Iterator;

public class LinkedQueueMain {

	public static void main(String[] args) {
		LinkedQueue queue = new LinkedQueue();
		String f�rsta = "f�rsta";
		String andra = "andra";
		String tredje = "tredje";
		String fj�rde = "fj�rde";
		
		
		
		
				
		
		queue.enqueue(f�rsta);
		queue.enqueue(andra);
		queue.enqueue(tredje);
		queue.enqueue(fj�rde);
		System.out.println(queue.toString());
		System.out.println(queue.size());
		System.out.println(queue.iterator().hasNext());
		Iterator itr = queue.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next().toString());
			
		}
		System.out.println("ost");
		System.out.println(queue.dequeue());
		System.out.println(queue.first());
		System.out.println(queue.last());
		
		
		
		
	}

}
