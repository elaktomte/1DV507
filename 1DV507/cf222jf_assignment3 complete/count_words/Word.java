package count_words;

public class Word implements Comparable<Word> {
	   private String word;
	 
	   
	   public Word(String str) {
		   word = str.toLowerCase();
	   }
	   
	   public String toString() { return word; }
	   
	   /* Override Object methods */
	   public int hashCode() { 
		 
		   return this.word.hashCode();
	   }
	   
	   public boolean equals(Object other) { 
		   
		   //... true if two words are equal
		return this.hashCode() == other.hashCode();   
	   }
	   
	   /* Implement Comparable */
	   public int compareTo(Word w) {// ... compares two words lexicographically 
		  
		   
		   return word.compareTo(w.word);
	   	}
	   
	   }
	
