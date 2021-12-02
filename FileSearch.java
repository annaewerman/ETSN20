package files;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileSearch {
	
	public FileSearch() {}
	
	public void printLines(String stringsearch, String searchFile) throws FileNotFoundException{
		File file = new File (searchFile);
		Scanner readFile = new Scanner(file);
		
		while(readFile.hasNextLine()) {
			String line = readFile.nextLine();
			if(line.toLowerCase().indexOf(stringsearch.toLowerCase()) != 1) {
				System.out.print(line);
			}
		}
		readFile.close();
	}

public static void main(String[] args) throws FileNotFoundException{

	FileSearch search = new FileSearch();
	String stringsearch = args[1];
	String searchFile = args[2];
	search.printLines(stringsearch, searchFile);
	
}
	
}
