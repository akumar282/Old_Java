
public class Boxes {
	
	public static void main(String args[]) {
		drawBoxes();
		System.out.println();
		drawBoxes();
	}

	public static void drawBoxes() {
		System.out.println("+------+");
		drawWalls();
		System.out.println("+------+");
	}
	
	public static void drawWalls() {
		System.out.println("|      |");
		System.out.println("|      |");
		System.out.println("|      |");
		System.out.println("|      |");
		System.out.println("|      |");
		System.out.println("|      |");
		System.out.println("|      |");
		System.out.println("|      |");
	}
}
