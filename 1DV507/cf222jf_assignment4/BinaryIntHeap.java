package cf222jf_assignment4;

public class BinaryIntHeap {
	private int size;
	public int[] arr;

	public BinaryIntHeap(){   // Constructs an empty heap
		arr = new int[10];
	}
	public void insert(int n){
		if (size == arr.length-1){
			int[] temparr = new int[2*arr.length];
			for (int i = 1; i < arr.length; i++){
				temparr[i] = arr[i];
			}
			arr = temparr;
		}

		if (size == 0){
			arr[1] = n;
			size++;
		}
		else{
			arr[size+1] = n;
			size++;
			int t = size;
			while(t > 1){
				if (arr[t/2] < arr[t]){
					int temp = arr[t/2];
					arr[t/2] = arr[t];
					arr[t] = temp;

				}
				t = t/2;

			}
		}

	}
	public int pullHighest() {
		int highest = arr[1];
		int t = 1;
		arr[1] = arr[size];
		arr[size] = 0;
		size--;
		while (t < size){

			if(arr[t*2] > arr[t*2+1] && arr[t] < arr[t*2] ){
					int temp = arr[t];
					arr[t] = arr[t*2];
					arr[t*2] = temp;
					t = t*2;
				}
			

			else if(arr[t*2] < arr[t*2+1] && arr[t] < arr[t*2+1]){
				
					int temp = arr[t];
					arr[t] = arr[t*2+1];
					arr[t*2+1] = temp;
					t = t*2+1;
				}
			
			else{
				t = t*2;
			}
		}



		return highest;
	}
	public int size(){
		return size;// Current heap size
	}
	public boolean isEmpty(){
		// True if heap is empty
		return size == 0;
	}
	public String toString(){
		String string = "[";
		for (int i = 0; i < arr.length; i++){
			string = string +arr[i]+","; 
		}
		string = string +"]";
		return string;
	}

}
