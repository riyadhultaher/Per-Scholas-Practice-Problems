package JavaBasicPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
public class FileDemo {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader ("/Users/riyadhul.taher/Documents/Coding/TestDocument.txt");
			
			int i = 0;
			while ((i = fr.read()) != -1) {
				System.out.print ((char) i);
			}
			fr.close();
			FileWriter fw = new FileWriter ("/Users/riyadhul.taher/Documents/Coding/TestDocument.txt", true);
			String string = "Hello ";
			fw.write(string);
			fw.close();
		}
		catch (Exception e) {
			System.out.println ("Error with file");
		}
	}

}
