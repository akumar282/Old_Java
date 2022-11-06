import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class gggg {
	
	public static void main(String[] args) 
		    throws IOException {

		        List<String> words = new ArrayList<String>();
		        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Abhi\\Documents\\engmix.txt"));
		        String line;
		        while ((line = reader.readLine()) != null) {
		            words.add(line);
		        }
		        reader.close();
		        System.out.println(words.size());



		        
		    }

}
