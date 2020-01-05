package cf222jf_assignment4.time;
import java.util.*;


public class Task2 {

	public static void main(String[] args) {
		long sum = (long) 0;
		
		/*
		for (int i = 0; i<10;i++){
		String teststring = "";
		int iterations = 0;
		long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		while (end-start < 1000){
			end = System.currentTimeMillis();
			teststring = teststring + "a";
			iterations++;
		}
		//System.out.println(end-start);
		//System.out.println("Iterations: " +iterations);
		sum = sum + iterations;
		}
		System.out.println("Concatination with short strings : "+(sum/10)+" iterations");
		sum = 0;
		
		
		//Average = 33021 iterations.
		//String length = 33021
	
		*/
		
		/*
		for (int i = 0; i < 10; i++){
			int iterations = 0;
			long start = System.currentTimeMillis();
			long end = System.currentTimeMillis();
			StringBuilder sb = new StringBuilder();
			while (end - start <1000){
				end = System.currentTimeMillis();
				sb.append("a");
				iterations++;
				
			}
			sb.toString();
			sum = sum + iterations;
			
			
		}
		System.out.println("Concatination with StringBuilder short strings : "+(sum/10)+" iterations");
		sum = 0;
		// averaged out to 19724280 iterations
		// String Length = 19724280 
		
		
		*/
		
		/*

		for (int i = 0; i<10;i++){
			String teststring = "";
			long iterations = 0;
			long start = System.currentTimeMillis();
			long end = System.currentTimeMillis();
			while (end-start < 1000){
				end = System.currentTimeMillis();
				teststring = teststring + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
				iterations++;
			}
			//System.out.println(end-start);
			//System.out.println("Iterations: " +iterations);
			sum = sum + iterations;
			}
			// Averaged 2570
			// 2570 * 80 = 205600 characters
			System.out.println("Concatination with long strings : "+(sum/10)+" iterations");
			sum = 0;
		
		
		*/
		
			for (int i = 0; i < 10; i++){
				long iterations = (long) 0;
				long start = System.currentTimeMillis();
				long end = System.currentTimeMillis();
				StringBuilder sb = new StringBuilder();
				while (end - start <1000){
					end = System.currentTimeMillis();
					sb.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
					
					iterations++;
				}
				sb.toString();
				sum = sum + iterations;
				
				
			}
			System.out.println("Concatination with StringBuilder long strings : "+(sum/10)+" iterations");
			// averaged 2149582
			// 4880 * 80 = 390400
			
	}

}
