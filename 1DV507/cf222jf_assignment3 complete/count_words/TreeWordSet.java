package count_words;
import java.util.*;

public class TreeWordSet implements WordSet{
	Node root;
	int size;

	public TreeWordSet(Word w){
		root = new Node(w);
	}


	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new NodeIterator();
	}




	@Override
	public void add(Word word) {
        Node compNode = root;
        while (compNode.left != null || compNode.right != null){
            if (compNode.word.compareTo(word) < 0){
                if (compNode.left == null)
                    break;
                compNode = compNode.left;
 
            } else if(compNode.word.compareTo(word) > 0 ){
                if (compNode.right == null)
                    break;
                compNode = compNode.right;
            }
            else if (compNode.word.compareTo(word) == 0){
            	break;
            }
 
 
        }
 
        if (compNode.word.compareTo(word) < 0){
            compNode.left = new Node(word);
            compNode = compNode.left;
            size++;
        } else if (compNode.word.compareTo(word) > 0){
            compNode.right = new Node(word);
            compNode = compNode.right;
            size++;
        }
 
 
    }




	@Override
	public boolean contains(Word word) {
		Node current = root;
		boolean answer = false;
		if (current.word.equals(word))
			answer = true;
		while (current.word.equals(word) == false ){
			if (current.word.equals(word))
				answer = true;
			else if (current.word.compareTo(word) < 0){
				current = current.left;
			}
			else if (current.word.compareTo(word) > 0){
				current = current.right;
			}
			else {
				answer = false;
			}

		}


		return false;
	}




	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public class Node {
		Node left;
		Node right;
		Word word;

		public Node(Word w){
			word = w;
		}
		public String toString(){
			return word.toString();
		}
	}
	
	public class NodeIterator implements Iterator{
		Node currentNode = root;
		Node[] itr;
		int currentI;
		int currentI2;
		
		public NodeIterator(){
			currentNode = root;
			itr = new Node[size +1];
			currentI = 0;
			
			visit(root);
		}
		public void visit(Node n){
			if (n.left != null){
				visit(n.left);
			}
			itr[currentI2] = n;
			currentI2++;
			if (n.right != null){
				visit(n.right);
			}
		}
		
		@Override
		public boolean hasNext() {
		
			
			return currentI < itr.length;
		}

		@Override
		public Object next() {
			Node temp = itr[currentI];
			currentI++;
			return temp;
		}
		
	}
}




