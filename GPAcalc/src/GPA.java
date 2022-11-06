import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GPA {

	private static Map<String, Double> map;
	static{
		map = new HashMap<>();
		map.put("A", 4.0);
		map.put("A-", 3.7);
		map.put("B+", 3.3);
		map.put("B", 3.0);
		map.put("B-", 2.7);
		map.put("C+", 2.5);
		map.put("C", 2.0);
		map.put("C-", 1.7);
		map.put("D+", 1.3);
		map.put("D", 1.0);
		map.put("F", 0.0);
	}	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("{A=4.0, A-=3.7, B+=3.3, B=3.0, B-=2.7, C+=2.5, C=2.0, C-=1.7, D+=1.3, D=1.0, F=0.0}");
		do {
			int years = 0;
			double rungpa = 0.0;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Number of Years (0 to exit)");
			years = input.nextInt();
			if(years == 0) {
				return;
			}
			for(int i = 1; i<=years; i++) {
				int terms = 0;
				System.out.println("Enter number of terms in year "+i);
				input = new Scanner(System.in);
				terms = input.nextInt();
				double termtotal = 0.0;
				double cumyear = termtotal/terms;
			
				for(int j = 1; j<=terms; j++) {
					double runtotal = 0.0;
					input = new Scanner(System.in);
					System.out.println("Enter number of classes in term "+j);
					int classes = input.nextInt();
				
					for(int k = 0; k<=classes; k++) {
						System.out.println("Enter the grade");
						String grade = input.nextLine();
						System.out.println(map.get(grade));
						if(map.containsKey(grade)) {
							runtotal+=map.get(grade);
						}
					}
					System.out.println(runtotal);
					double term = runtotal/classes;
					System.out.println("Term "+j+" GPA: "+term);
					termtotal+=term;
					cumyear = termtotal/terms;
				}
				System.out.println("Cumilative Year GPA: "+cumyear);
				rungpa+=cumyear;
			}
			System.out.println("Total GPA of High-School/College: "+rungpa/years);
		}while(1==1);
	}
	
}
