import java.io.*;
import java.util.*;

class QuestionTwo{
	public static void main(String[] args) {

		File file = new File("QuestionTwoFile.txt");
		String str = "";

		int numberOfCharacters = 0;
		int numberOfWords = 0;
		int numberOfLines = 0;
			

		if(file.exists()==false){
			System.out.println("File does not exist.");
		}

		try{
			int value;
			FileInputStream fileChar = new FileInputStream(file);
			while((value = fileChar.read()) != -1){
				numberOfCharacters++;
				if(value==32 || value ==46){
					numberOfWords++;
				}
			}
			fileChar.close();
			System.out.println("Total number of Characters: " + numberOfCharacters);
			System.out.println("Total number of Words: " + numberOfWords);
		} catch (IOException e){
			System.out.println("Unable to read file currently...");
		}

		try{
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((str = br.readLine()) != null){
				numberOfLines++;
			}
			br.close();
			System.out.println("Total number of Lines: " + numberOfLines);

		} catch(IOException e){
			System.out.println("Can't read from the file...");
		}
	}
}