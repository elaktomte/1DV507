package cf222jf_Assignment3;
import java.util.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SortTest {

	@Before
	public void setUp() throws Exception {
		
		
	}

	@Test
	public void insertionSortTest(){
		int[] testlist = {5,2,1,4,3};
		int[] testSorted = {1,2,3,4,5};
		SortingAlgorithms sorting = new SortingAlgorithms();
		
		assertArrayEquals(testSorted ,sorting.insertionSort(testlist));
		
		
	}
	@Test 
	public void insertionSorttest2(){
		SortingAlgorithms sort = new SortingAlgorithms();
		String[] testSorted = {"a","bb","ccc","dddd","eeeee","ffffff"};
		String[] test = {"ccc","bb","dddd","ffffff","a","eeeee"};
		Comparator<String> byLength = (String s1, String s2) -> s1.length() - s2.length();
		assertArrayEquals(testSorted, sort.insertionSort(test, byLength));
	}
}
