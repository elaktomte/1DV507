package cf222jf_assignment4.time;
import java.util.*;
import cf222jf_Assignment3.SortingAlgorithms;

public class Task3 {

	public static void main(String[] args) {
		int sum = 0;
		Random rand = new Random();
		int[] testarr = new int[100];
		SortingAlgorithms sort = new SortingAlgorithms();
		for (int i = 0; i < testarr.length; i++)
			testarr[i] = rand.nextInt(1000);
		String[] testarr2 = new String[100];
		//Ascii 32-126

		for (int i = 0; i<testarr2.length; i++){
			String inputstring ="";
			for (int j = 0; j < 10; j++){
				char randomchar = (char)((rand.nextInt(94)+32));
				inputstring =inputstring + randomchar;
				
			}
			testarr2[i]= inputstring;


		}
		
		for (int i = 0; i <10; i++){
			int iterations = 0;
			long start = System.currentTimeMillis();
			long end = System.currentTimeMillis();

			while (end-start <1000){
				end = System.currentTimeMillis();
				sort.insertionSort(testarr);
				iterations++;
			}
			sum = sum+iterations;

		}
		System.out.println("Int arrays sorted: "+sum/10);
		sum = 0;
		// Averages to 4105 times sorted
		// 410500 integers sorted.
		
		
		Comparator comp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
			
		};
		for (int i = 0; i <10; i++){
			int iterations = 0;
			long start = System.currentTimeMillis();
			long end = System.currentTimeMillis();

			while (end-start <1000){
				end = System.currentTimeMillis();
				sort.insertionSort(testarr2, comp);
				iterations++;
			}
			sum = sum+iterations;

		}
		System.out.println("Strings arrays sorted: "+sum/10);
		
		// Average 785 sortings
		// Sorts about 785000 strings.
	}

}
