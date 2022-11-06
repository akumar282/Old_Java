import java.util.Scanner;

public class calcdrive {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Hello, this application allows you to calculate all measurements of a 3D prism");
		System.out.println("To use, simply type in what shape you would like to solve");
		System.out.println("To solve for measurements other than surface area or volume, simply type : solve for _____ and the field you would like to solve for ");
		System.out.println("This program also include a simple four function calculator with square root functionality. To use simply type in -calculator- or -calc- ");
		
		do {
		System.out.println();
		System.out.println("Hello, What shape would you like to calculate today (press x to terminate): ");
		String shap = input.nextLine(); 
		if (shap.equalsIgnoreCase("Trianglular Prism")) {
			triforce();	
			}
		if (shap.equalsIgnoreCase("Cylinder")) {
			cyl3D.cyl();
			}
		if (shap.equalsIgnoreCase("Hexagonal Prism") || shap.contains("hex")) {
			hex();
			}
		if (shap.equalsIgnoreCase("Octagonal Prism")) {
			oct();
			}
		if (shap.equalsIgnoreCase("Cube") || shap.equalsIgnoreCase("Rectangular Prism")) {
			shap();
			}
		if (shap.equalsIgnoreCase("Cone")) {
			cone();
			}
		if (shap.equalsIgnoreCase("Sphere")) {
			sphere();
			}
		if (shap.equalsIgnoreCase("Recent Shapes")) {
			System.out.println(shapes3D.storage);
			}
		if (shap.equalsIgnoreCase("x")) {
			shapes3D.storage.clear();
			return;
			}
		if (shap.equalsIgnoreCase("Pyramid") || shap.contains("mid")) {
			rectpryd();
			}
		if (shap.equalsIgnoreCase("solve for height") || shap.equalsIgnoreCase("height") || shap.contains("hei")) {
			System.out.println("What shape would you like to solve for? ");
			Scanner in = new Scanner(System.in);
			String inp = in.nextLine();
			if(inp.equalsIgnoreCase("Rectangular Prism")) {
				rects();
				}
			if(inp.equalsIgnoreCase("Pyramid") || inp.contains("mid")) {
				pyrpr();
				}
			if(inp.equalsIgnoreCase("Hexagonal Prism") || inp.contains("hex")) {
				hexhex();
				}
			if(inp.equalsIgnoreCase("Octagonal Prism")) {
				octoct();
				}
			if(inp.equalsIgnoreCase("Cone")) {
				concon();
				}
			if(inp.equalsIgnoreCase("Cylinder") || inp.contains("der")) {
				cylcyl();
				}
			if(inp.equalsIgnoreCase("Cube")) {
				System.out.println("Height of a cube is equivilant to its length and width");
				System.out.println();
				}
			}
		if (shap.equalsIgnoreCase("calculator") || shap.equalsIgnoreCase("calc")) {
			System.out.println("This calculator only support basic four functions including square root. To use, simply type in the command you require or its three letter abbreviation (sqrt for square root).");
			simpcalc();
		}
		} while(1 == 1);

	}
	private static void triforce() {
		Scanner input = new Scanner(System.in);
		tripris3D tri1 = new tripris3D();
		System.out.println("Enter edge1 value: ");
		double an = input.nextDouble();
		tri1.muta(an);
		System.out.println("Enter edge2 value: ");
		double bn = input.nextDouble();
		tri1.mutb(bn);
		System.out.println("Enter edge3 value: ");
		double cn = input.nextDouble();
		tri1.mutc(cn);
		System.out.println("Enter height value: ");
		double hn = input.nextDouble();
		tri1.muth(hn);
		tri1.volume();
		tri1.sf();
		System.out.println(tri1.toString());
		shapes3D.storeshape(tri1);
	}
	private static void cyl() {
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
	private static void shap() {
		Scanner input = new Scanner(System.in);
		shapes3D cube2 = new shapes3D();
		System.out.println("Enter length value: ");
		double ln = input.nextDouble();
		cube2.mutl(ln);
		System.out.println("Enter width value: ");
		double wn = input.nextDouble();
		cube2.mutw(wn);
		System.out.println("Enter height value: ");
		double hn = input.nextDouble();
		cube2.muth(hn);
		cube2.volume();
		cube2.sf();
		cube2.shapetype();
		System.out.println(cube2.toString());
		shapes3D.storeshape(cube2);
	}
	private static void oct() {
		Scanner input = new Scanner(System.in);
		octpris3D oct1 = new octpris3D();
		System.out.println("Enter edge value: ");
		double en = input.nextDouble();
		oct1.mute(en);
		System.out.println("Enter height value: ");
		double hn = input.nextDouble();
		oct1.muth(hn);
		oct1.volume();
		oct1.basearea();
		oct1.sf();
		oct1.latsuf();
		System.out.println(oct1.toString());
		shapes3D.storeshape(oct1);
	}
	private static void hex() {
		Scanner input = new Scanner(System.in);
		hexpris3D hex = new hexpris3D();
		System.out.println("Enter edge value: ");
		double en = input.nextDouble();
		hex.mute(en);
		System.out.println("Enter height value: ");
		double hn = input.nextDouble();
		hex.muth(hn);
		hex.volume();
		hex.sf();
		hex.latsuf();
		hex.basearea();
		System.out.println(hex.toString());
		shapes3D.storeshape(hex);
	}
	private static void cone() {
		Scanner input = new Scanner(System.in);
		cone3D cone = new cone3D();
		System.out.println("Enter radius value: ");
		double rn = input.nextDouble();
		cone.mutr(rn);
		System.out.println("Enter height value: ");
		double hn = input.nextDouble();
		cone.muth(hn);
		cone.volume();
		cone.sf();
		cone.latsuf();
		cone.slantheight();
		System.out.println(cone.toString());
		shapes3D.storeshape(cone);
	}
	private static void sphere() {
		Scanner input = new Scanner(System.in);
		sph3D sphere = new sph3D();
		System.out.println("Enter radius value: ");
		double rn = input.nextDouble();
		sphere.mutr(rn);
		sphere.volume();
		sphere.sf();
		System.out.println(sphere.toString());
		shapes3D.storeshape(sphere);
	}
	private static void rectpryd() {
		Scanner input = new Scanner(System.in);
		rectpry3D rectpry = new rectpry3D();
		System.out.println("Enter base length");
		double bn = input.nextDouble();
		rectpry.mutl(bn);
		System.out.println("Enter base width");
		double wn = input.nextDouble();
		rectpry.mutw(wn);
		System.out.println("Enter height");
		double hn = input.nextDouble();
		rectpry.muth(hn);
		rectpry.basear();
		rectpry.sf();
		rectpry.latsuf();
		rectpry.basear();
		rectpry.volume();
		rectpry.shapetype();
		System.out.println(rectpry.toString());
		shapes3D.storeshape(rectpry);
	}
	private static void rects() {
		Scanner input = new Scanner(System.in);
		heightsolve d = new heightsolve();
		System.out.println("Please enter the volume value:");
		double vol = input.nextDouble();
		d.mutv(vol);
		System.out.println("Please enter the length value:");
		double len = input.nextDouble();
		d.mutl(len);
		System.out.println("Please enter the width value:");
		double wid = input.nextDouble();
		d.mutw(wid);
		System.out.println("The height value is: "+d.recth());
		System.out.println();
	}
	private static void pyrpr() {
		Scanner input = new Scanner(System.in);
		heightsolve d = new heightsolve();
		System.out.println("Please enter the length value:");
		double len = input.nextDouble();
		d.mutl(len);
		System.out.println("Please enter the width value:");
		double wid = input.nextDouble();
		d.mutw(wid);
		System.out.println("Please enter the volume value:");
		double vol = input.nextDouble();
		d.mutv(vol);
		System.out.println("The height value is: "+d.pyrpris());
		System.out.println();
	}
	private static void concon() {
		Scanner input = new Scanner(System.in);
		heightsolve d = new heightsolve();
		System.out.println("Please enter the volume value:");
		double vol = input.nextDouble();
		d.mutv(vol);
		System.out.println("Please enter the radius value:");
		double rad = input.nextDouble();
		d.mutr(rad);
		System.out.println("The height value is: "+d.conepri());
		System.out.println();
	}
	private static void hexhex() {
		Scanner input = new Scanner(System.in);
		heightsolve d = new heightsolve();
		System.out.println("Please enter the volume value:");
		double vol = input.nextDouble();
		d.mutv(vol);
		System.out.println("Please enter the base edge value:");
		double basee = input.nextDouble();
		d.basee(basee);
		System.out.println("The height value is: "+d.hexpri());
		System.out.println();
	}
	private static void octoct() {
		Scanner input = new Scanner(System.in);
		heightsolve d = new heightsolve();
		System.out.println("Please enter the volume value:");
		double vol = input.nextDouble();
		d.mutv(vol);
		System.out.println("Please enter the base edge value:");
		double basee = input.nextDouble();
		d.basee(basee);
		System.out.println("The height value is: "+d.octpri());
		System.out.println();
	}
	private static void cylcyl() {
		Scanner input = new Scanner(System.in);
		heightsolve d = new heightsolve();
		System.out.println("Please enter the volume value:");
		double vol = input.nextDouble();
		d.mutv(vol);
		System.out.println("Please enter the radius value:");
		double rad = input.nextDouble();
		d.mutr(rad);
		System.out.println("The height value is: "+d.cylh());
		System.out.println();
	}
	@SuppressWarnings("resource")
	private static void simpcalc() {
		Scanner input = new Scanner(System.in);
		String comm = input.nextLine();
		if(comm.equalsIgnoreCase("add")) {
			Scanner opp = new Scanner(System.in);
			System.out.println("First value?");
			double val1 = opp.nextDouble();
			System.out.println("Second value?");
			double val2 = opp.nextDouble();
			System.out.println(val1+val2);
		}
		if(comm.equalsIgnoreCase("subtract") || comm.equalsIgnoreCase("sub")) {
			Scanner opp = new Scanner(System.in);
			System.out.println("First value?");
			double val1 = opp.nextDouble();
			System.out.println("Second value?");
			double val2 = opp.nextDouble();
			System.out.println(val1-val2);
		}
		if(comm.equalsIgnoreCase("mutliply") || comm.equalsIgnoreCase("mult")) {
			Scanner opp = new Scanner(System.in);
			System.out.println("First value?");
			double val1 = opp.nextDouble();
			System.out.println("Second value?");
			double val2 = opp.nextDouble();
			System.out.println(val1*val2);
		}
		if(comm.equalsIgnoreCase("divide") || comm.equalsIgnoreCase("div")) {
			Scanner opp = new Scanner(System.in);
			System.out.println("First value?");
			double val1 = opp.nextDouble();
			System.out.println("Second value?");
			double val2 = opp.nextDouble();
			System.out.println(val1/val2);
		}
		if(comm.equalsIgnoreCase("square root") || comm.equalsIgnoreCase("sqrt")) {
			Scanner opp = new Scanner(System.in);
			System.out.println("Value to root?");
			double sq = opp.nextDouble();
			System.out.println(Math.sqrt(sq));
		}
	}
		
}