package count_words;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordCount2Main {

	public static void main(String[] args) {
		File inputfile = new File("C:\\Testmapp\\words.txt");
		HashWordSet hashen = new HashWordSet();
		Scanner scan;
		TreeWordSet tree = new TreeWordSet(new Word("fishingboat"));
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
					hashen.add(new Word(word));
					tree.add(new Word(word));
					
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


			
			//System.out.println(hashen.toString());
			Word testword = new Word("computer");
			System.out.println(tree.contains(testword));
			Iterator iterator = tree.iterator();
			while (iterator.hasNext()){
				System.out.println(iterator.next().toString());
			}
			
			
			/*System.out.println(tree.size());
			System.out.println(tree.contains(testword));
			Iterator<Word> TI = tree.iterator();

			while (TI.hasNext()){
				System.out.println(TI.next().toString());
			}
			*/


		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
