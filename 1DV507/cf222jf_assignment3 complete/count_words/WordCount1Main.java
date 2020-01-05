package count_words;
import java.util.*;
import java.io.*;



public class WordCount1Main {

	public static void main(String[] args) {
		File inputfile = new File("C:\\Testmapp\\words.txt");
		HashSet<Word> hashen = new HashSet<Word>();
		Scanner scan;
		TreeSet<Word> tree = new TreeSet<Word>();
		try {
			scan = new Scanner(inputfile);
			String line = "";
			int j = 0;
			ArrayList<Word> test = new ArrayList<Word>();
			while (scan.hasNextLine()){
				line = line+scan.nextLine();
			}
				for (int i = 0; i < line.length(); i++){
					if (Character.isWhitespace(line.charAt(i))){
						StringBuilder sb = new StringBuilder();
						String word = line.substring(j,i);
						sb.append(word);
						test.add(new Word(word));
						
						//System.out.println(sb.toString());
						//hashen.add(new Word(sb.toString()));
						//tree.add(new Word(sb.toString()));
						j = i+1;
						i=j;
					}
					
				}
				
				/*Comparator<Developer> byName =
				(Developer o1, Developer o2)->o1.getName().compareTo(o2.getName());
				*/
				
			
			hashen.addAll(test);
			tree.addAll(test);
			System.out.println(hashen.isEmpty());
			System.out.println(hashen.toString());
			Word testword = new Word("about");
			System.out.println(hashen.contains(testword));
			System.out.println(tree.size());
			System.out.println(tree.contains(testword));
			Iterator<Word> TI = tree.iterator();
		
			while (TI.hasNext()){
				System.out.println(TI.next().toString());
			}
			

		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	




}


