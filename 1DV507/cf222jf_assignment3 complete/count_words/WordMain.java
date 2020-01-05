package count_words;

public class WordMain {

	public static void main(String[] args) {
		Word w1 = new Word("abcde");
		Word w2 = new Word("kalle");
		Word w3 = new Word("ABCDE");
		
		System.out.println(w1.toString());
		System.out.println(w1.hashCode());
		System.out.println(w3.hashCode());
		System.out.println(w1.equals(w3));
		System.out.println(w1.compareTo(w2));
		System.out.println(w1.compareTo(w3));
		
		

	}

}
