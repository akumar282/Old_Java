import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ubotw {

	public static void main(String[] args) throws FileNotFoundException{
		ArrayList<String> list = new ArrayList<>();
		File file = new File("C:\\Users\\Abhi\\Documents\\poopooletter.txt");
		Scanner in = new Scanner(file);	
		String words; 
		while(in.hasNextLine()) {
			list.add(in.nextLine());
		}
		String res = String.join(",", list);
        convert(res);
        
	}
	
	public static String convert(String str) {
		char[] strarr = new char[str.length()];
		for(int i = 0; i<str.length(); i++) {
			char c = str.charAt(i);
			strarr[i] = c;
			for(int j = 0; j<strarr.length;j++) {
				if(strarr[j] == 'l'|| strarr[j] == 'r') {
					strarr[j] = 'w';
				}
			}
		}
		String fin = new String(strarr);
		System.out.println(fin);
		return fin;
	}

}
