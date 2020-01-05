package cf222jf_Assignment3;

public class EuclidianMain {

	public static void main(String[] args) {
		int n1 = 42;
		int n2 = 12;
		int sgd = 0;
		int n3 = 0;
		
		while (n2 != 0){
			if (n2 == 0){
				
			
			}
			else{
				n3 = n1 % n2;
			}
		n1 = n2;
		n2 = n3;
			
			
			
		}
		sgd = n1;
		
		System.out.println("The biggest common divider is : "+sgd);
		
		
	}

}
