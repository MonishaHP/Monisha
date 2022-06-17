import java.io.*;
import java.io.File;
import java.util.Scanner;

public class ReadingFile {
	public static void main(String[] arg) throws Exception {
		File fileread = new File("ABC.txt");
		Scanner sc = new Scanner(fileread);

		 while (sc.hasNextLine()) 
			 System.out.println(sc.nextLine()); 
	}
}