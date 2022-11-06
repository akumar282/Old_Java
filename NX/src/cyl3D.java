import java.util.Scanner;

public class cyl3D extends shapes3D{
	public double radius;
	public double basearea;
	public double lateral;
	
	public cyl3D (double r, double height) {
		r = radius;
		this.height = height;
		type = "Cylinder";
	}
	public cyl3D () {
		radius = 0.0;
		height = 0.0;
		type = "Cylinder";
	}
	public void mutr(double radius) {
		this.radius = radius;
	}
	public void muth(double height) {
		this.height = height;
	}
	public double getr() {
		return radius;
	}
	public double geth() {
		return height;
	}
	public double volume() {
		volume = Math.PI*(radius*radius)*height;
		return Math.PI*(radius*radius)*height;
	}
	public double sf() {
		double sf;
		sf = 2*Math.PI*radius*height+2*Math.PI*(radius*radius);
		surfacear = sf;
		return sf;
	}
	public double basear() {
		double ar; 
		ar = Math.PI*(radius*radius);
		basearea = ar;
		return ar;
	}
	public double latsuf() {
		double lat;
		lat = 2*Math.PI*radius*height;
		lateral = lat; 
		return lat;
	}
	public String toString() {
		return " Shape: "+type+" | Radius = "+radius+" | Height = "+height+" | Surface Area = "+surfacear+" | Volume = "+volume+" | Lateral Area = "+lateral+" | Base Area = "+basearea; 
	}
	public static void cyl() {
		Scanner input = new Scanner(System.in);
		cyl3D cyl1 = new cyl3D();
		System.out.println("Please enter the radius value:");
		double rn = input.nextDouble();
		cyl1.mutr(rn);
		System.out.println("Please enter the height value:");
		double hn = input.nextDouble();
		cyl1.muth(hn);
		cyl1.volume();
		cyl1.sf();
		cyl1.basear();
		cyl1.latsuf();
		System.out.println(cyl1.toString());
		shapes3D.storeshape(cyl1);
	}
	

}
