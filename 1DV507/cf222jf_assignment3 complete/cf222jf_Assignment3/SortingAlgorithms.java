package cf222jf_Assignment3;
import java.util.*;
import java.util.Collections;
import java.util.Arrays;


/* public int[] insertionSort(int[] in)  
   public int[] mergeSort(int[] in)         // VG Exercise
   public String[] insertionSort(String[] in, Comparator<String> c)  
   public String[] mergeSort(String[] in, Comparator<String> c)   // VG Exercise */

public class SortingAlgorithms {

	


	public int[] insertionSort(int[] in){
		int[] out = in.clone();
		for ( int i = 1; i < out.length ; i++){
			
			for ( int j = i-1; j >= 0; j--){
				if (out[j] > out[i]){
					int temp = out[i];
					out[i] = out[j];
					out[j] = temp;
					i = j;
					
					
				}
				
			}
		}
		
		return out;	
	}
	
	public String[] insertionSort(String[] in, Comparator<String> c){
		/*String[] out = in.clone();
		//Comparator<String> byLength = (String s1, String s2) -> s1.length() - s2.length();
		sort(out , c);
		*/
		String[] out = in.clone();
		for ( int i = 1; i < out.length; i++){
			for (int j = i-1; j >= 0; j--){
				if(c.compare(out[j], out[i]) == 1){
					String temp = out[i];
					out[i] = out[j];
					out[j] = temp;
					i = j;
				}
				
			}
		}
		
		
		
		return out;
	}

	

}
