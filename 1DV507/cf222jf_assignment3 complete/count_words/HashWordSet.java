package count_words;
import java.util.*;


public class HashWordSet implements WordSet{
	private int size;
	Node[] arr = new Node[10];

	public HashWordSet(int az){
		arr = new Node[az];
	}
	public HashWordSet(){

	}


	@Override
	public Iterator iterator() {

		return new NodeIterator(arr);
	}

	@Override
	public void add(Word word) {


		if (size == arr.length){
			reHash();
		}
		int hash = word.hashCode()%arr.length;
		if (hash <0){
			hash = hash*-1;
		}
		if(contains(word) == true){
			System.out.println("The word " +word+ " already exists. Will not be added.");
			
		}
		else{

			if(arr[hash] == null){
				arr[hash] = new Node(word);
				size++;
			}
			else{
				Node tempNode = arr[hash];
				while (tempNode.nextNode != null)
					tempNode = tempNode.nextNode;

				tempNode.nextNode = new Node(word);
				size++;
			}
		}
	}

	@Override
	public boolean contains(Word word) {
		int hash = word.hashCode()%arr.length;
		if (hash <0)
			hash = hash*-1;
		boolean answer = false;
		Node node;
		if (arr[hash] == null){
			return false;
		}
		else{
			node = arr[hash];
			while (answer == false && node.nextNode != null ){
				if (node.word.equals(word))
					answer = true;
				else if (node.nextNode.word.equals(word)){
					answer = true;
				}
				else{
					node = node.nextNode;


				}

			}
		}
		return answer;
	}
	public void reHash(){
		HashWordSet temp = new HashWordSet(2*size);
		Node tempNode;
		for (int i = 0; i < arr.length; i++){
			if (arr[i] != null){
				tempNode = arr[i];
				temp.add(arr[i].word);
				while (tempNode.nextNode != null){
					tempNode = tempNode.nextNode;
					temp.add(tempNode.word);

				}


			}
			/*while (arr[i] != null){
				Node tempN = arr[i];
				while (tempN.nextNode != null){
				int hash = tempN.word.hashCode()%arr.length;
				if (hash <0)
					hash = hash*-1;
				if (temp[hash] == null)
					temp[hash] = tempN;
				else{

					temp[hash].nextNode = tempN;
				}
				tempN = tempN.nextNode;
				}
			}*/
		}
		arr = temp.arr;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}


	public class Node{
		private Node nextNode;
		private Word word;
		private Node current;

		public Node(Word w){
			word = w;
		}
		public Node next(){
			Node next = current;
			current = current.nextNode;
			return next;

		}
		public String toString(){
			return word.toString();
		}
		public boolean hasNext(){
			return this.nextNode != null;
		}

	}

	public class NodeIterator implements Iterator{
		Node[] array;
		Node currentNode;
		int currentIndex = 0;
		Node itrNode;
		public NodeIterator(Node[] arr){
			array = new Node[size];
			for (int i = 0; i < arr.length; i++){
				if (arr[i] != null){
					Node tempNode = arr[i];
					array[currentIndex] = tempNode;
					currentIndex++;
				
				while(tempNode.nextNode != null){
					tempNode = tempNode.nextNode;
					array[currentIndex] = tempNode;
					currentIndex++;
					
					}
				}
			}
			for (Node s : array){
				System.out.println(s.toString());
			}
			currentIndex = 0;
		}
		public boolean hasNext(){
			
			/* int i = 0;
			while (currentNode == null){
				for (int j = 0; j < array.length;j++){	//finding the first node if the iterator has not traveled.
					if (array[j] != null)
						currentNode = array[j];
				}
			}
			for (int j = 0; j < array.length; j++){	//finding the current index of the node.

				if (array[j] != null){
					if (array[j].equals(currentNode))
						i=j;
					
					if (array[j].nextNode != null){
						if (array[j].nextNode.equals(currentNode))
							i = j;
						itrNode = array[j].nextNode;
						while (itrNode.nextNode != null){
							if (itrNode.equals(currentNode)){
								i = j;
								break;
							}
							itrNode = itrNode.nextNode;
						}
					}

				}
			}	

			while (answer = false && i < array.length){
				i++;
				if (currentNode.nextNode != null){
					answer = true;
				}
				else if (array[i] != null){
					answer = true;
				}
			}
			*/
			return currentIndex < array.length-1;
		}
		public Node next(){
			Node tempNode = array[currentIndex];
			if (currentIndex < array.length)
				currentIndex++;
			/*
			int i = 0;
			if ( currentNode.nextNode != null)
				currentNode = currentNode.nextNode;
			else {
				for (int j = 0; j < array.length; j++){		//finding the current index of the node.
					if (array[j].equals(currentNode))
						i=j;
					if (array[j].nextNode.equals(currentNode))
						i = j;
					if (array[j].nextNode != null){
						itrNode = array[j].nextNode;
						while (itrNode.nextNode != null){
							if (itrNode.equals(currentNode)){
								i = j;
								break;
							}
							itrNode = itrNode.nextNode;
						}
					}

				}
				if (array[i+1]!= null){
					currentNode = array[i+1];
				}
				else{
					for (int j = i+1; j < array.length; j++){
						if(array[j] != null)
							currentNode = array[j];
					}
				}

			}
			*/
			return tempNode;
		}
	}
}


