package count_words;
import java.util.*;
import java.io.*;

public class IdentifyWordsMain {

	public static void main(String[] args) {
		File inputFile = new File("C:\\Testmapp\\HistoryOfProgramming.txt");
		File outputFile = new File("C:\\Testmapp\\words.txt");
		
		try {
			Scanner scan = new Scanner(inputFile);
			FileWriter writer = new FileWriter(outputFile);
			while (scan.hasNextLine()){
				String ctrl = scan.nextLine();
				String fixed = ctrl.replaceAll("[^a-zA-Z\\s]", "");
				fixed = fixed.replaceAll("  ", " ");
				fixed = fixed.replaceAll("  ", " ");
				fixed = fixed.replaceAll("  ", " ");
				System.out.print(fixed);
				writer.write(fixed+System.lineSeparator());
				writer.flush();
				
				
		
				/* for (int i = 0; i < ctrl.length(); i++){
					/*if (Character.isWhitespace(ctrl.charAt(i))){
						StringBuilder sb = new StringBuilder();
						sb.append(ctrl.substring(j , i));
						//sb.append(' ');
						writer.write(sb.toString());
						j = i+1;

					}	
					 if (Character.isLetter(ctrl.charAt(i)) == false){
						StringBuilder sb = new StringBuilder();
						sb.append(ctrl.substring(j,i));

						writer.write(sb.toString());
						j = i+1;
					}


				}
		*/
				
				
			}
			
			writer.close();
		} 
			catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				

			
		}
	}
