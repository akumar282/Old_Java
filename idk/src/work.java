import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class work {
	public static void main(String[] args) 
		    throws FileNotFoundException {

		        ArrayList<String> list = new ArrayList<>();

		        File file = new File("C:\\Users\\Abhi\\Documents\\engmix.txt");
		        Scanner input = new Scanner(file);

		        while(input.hasNext()){
		            list.add(input.next());
		        }
		        System.out.println(list);
		        System.out.println(list.size());



		        
		    }
}
