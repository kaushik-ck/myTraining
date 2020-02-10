import java.io.*;
import java.util.*;

class QuestionOne{
	public static void main(String[] args) {

		File file = new File("QuestionOneFile.txt");
		String str = "";
		int i=1;
		
		try{
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((str = br.readLine()) != null){
				System.out.println(i + ". " + str);
				i++;
			}
			br.close();
		} catch(IOException e){
			System.out.println("Can't read from the file...");
		}
	}
}