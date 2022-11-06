import java.util.ArrayList;
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
		if (shap.equalsIgnoreCase("Triangular Prism")) {
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
	static class shapes3D {
		public double length;
		public double width; 
		public double height;
		public String type;
		public double surfacear;
		public double volume; 
		static ArrayList<shapes3D> storage = new ArrayList<>();
		
		public shapes3D(double length, double width, double height) {
			this.length = length;
			this.width = width;
			this.height= height;
		}
		public shapes3D() {
			length = 0.0;
			width = 0.0;
			height = 0.0;
		}
		public void mutl(double length) {
			this.length = length;
		}
		public void mutw(double width) {
			this.width = width;
		}
		public void muth(double height) {
			this.height = height;
		}
		public double  getlength() {
			return length;
		}
		public double  getheight() {
			return height;
		}
		public double  getwidth() {
			return width;
		}
		public double volume() {
			volume = length*height*width;
			return length*height*width;
		}
		public double sf() {
			double sf;
			sf = (2*(length*width))+(2*(height*width))+(2*(length*height));
			surfacear = sf;
			return sf;
		}
		public static double calcSF(double l, double w, double h) {
			double sf; 
			sf = (2*(l*w))+(2*(h*w))+(2*(l*h));
			return sf;
		}
		public static ArrayList<shapes3D> storeshape(shapes3D shape){
			storage.add(shape);
			return storage;
		}
		public static ArrayList<shapes3D> clearhistory(){
			storage.clear();
			return storage;
		}
		public String shapetype() {
			String cube = "Cube";
			String rect = "Rectangular Prism";
			if(length == width && width == height) {
				type = cube;
				return cube;
			}else {
				type = rect;
				return rect;
			}
		}
		public String toString() {
			return " Shape: "+type+" | length = "+length+" | Width = "+width+" | Height = "+height+" | Surface Area = "+surfacear+" | Volume = "+volume; 
		}
		
	}
	static class rectpry3D extends shapes3D{
		public double lateral;
		public double basearea;
		
		
		public rectpry3D (double blength, double bwidth, double bheight) {
			blength = length;
			bwidth = width;
			bheight = height;
		}
		public rectpry3D () {
			height = 0.0;
			width = 0.0;
			length = 0.0;
		}
		public String shapetype() {
			String sqpry = "Square Pyramid";
			String rect = "Rectangular Pyramid";
			if(length == width) {
				type = sqpry;
				return sqpry;
			}else {
				type = rect;
				return rect;
			}
		}
		public void mutl(double length) {
			this.length = length;
		}
		public void mutw(double width) {
			this.width = width;
		}
		public void muth(double height) {
			this.height = height;
		}
		public double sf() {
			double lw = length*width;
			double w2 = width/2.0;
			double h2 = height*height;
			double l2 = length/2;
			surfacear = lw+length*Math.sqrt((w2*w2)+h2)+width*Math.sqrt((l2*l2)+h2);
			return lw+length*Math.sqrt((w2*w2)+h2)+width*Math.sqrt((l2*l2)+h2);
		}
		public double volume() {
			double lwh = length*width*height;
			volume = lwh/3;
			return lwh/3;
		}
		public double latsuf() {
			double lw = length*width;
			double w2 = width/2.0;
			double h2 = height*height;
			double l2 = length/2;
			lateral = length*Math.sqrt((w2*w2)+h2)+width*Math.sqrt((l2*l2)+h2);
			return length*Math.sqrt((w2*w2)+h2)+width*Math.sqrt((l2*l2)+h2);
		}
		public double basear() {
			basearea = length*width;
			return length*width;
		}
		public String toString() {
			return " Shape: "+type+" | Base Length = "+length+" | Base Width = "+width+" | Height = "+height+" | Surface Area = "+surfacear+" | Volume = "+volume+" | Lateral Area = "+lateral+" | Base Area = "+basearea; 
		}
	}
	static class tripris3D extends shapes3D {
		private double a;
		public double b;
		public double c;
		
		public tripris3D(double a, double b, double c, double height) {
			this.a = a;
			this.b = b;
			this.c = c; 
			this.height = height;
			type = "Triangular Prism";
		}
		public tripris3D() {
			a = 0.0;
			b = 0.0;
			c = 0.0;
			height = 0.0;
			type = "Trianglular Prism";
		}
		public void muta(double a) {
			this.a = a;
		}
		public void mutb(double b) {
			this.b = b;
		}
		public void mutc(double c) {
			this.c = c;
		}
		public void muth(double height) {
			this.height = height;
		}
		public double volume() {
			double vol; 
			double ab = (a*b)*(a*b);
			double ac = (a*c)*(a*c);
			double bc = (b*c)*(b*c);
			double a4 = a*a*a*a;
			double c4 = c*c*c*c;
			double b4 = b*b*b*b;
			double bin = 0.25*height;
			vol = (bin*Math.sqrt(-a4+2*ab+2*ac-b4+2*bc-c4));
			volume = vol;
			return vol;
		}
		public double sf() {
			double sf;
			double ab = (a*b)*(a*b);
			double ac = (a*c)*(a*c);
			double bc = (b*c)*(b*c);
			double a4 = a*a*a*a;
			double c4 = c*c*c*c;
			double b4 = b*b*b*b;
			double ah = a*height;
			double bh = b*height;
			double ch = c*height;
			sf = (ah+bh+ch+0.50*Math.sqrt(-a4+2*ab+2*ac-b4+2*bc-c4));
			surfacear = sf;
			return sf;
		}
		public double geta() {
			return a;
		}
		public double getb() {
			return b;
		}
		public double getc() {
			return c;
		}
		public String toString() {
			return " Shape: "+type+" | Edge a = "+a+" | Edge b = "+b+" | Edge c = "+c+" | Height = "+height+" | Surface Area = "+surfacear+" | Volume = "+volume; 
		}
	}
	static class sph3D extends shapes3D{
		public double radius;
		
		public sph3D(double radius) {
			this.radius = radius;
			type = "Sphere";
		}
		public sph3D() {
			radius = 0.0;
			type = "Sphere";
		}
		public void mutr(double radius) {
			this.radius = radius;
		}
		public double getr() {
			return radius;
		}
		public double volume() {
			volume = (4/3)*Math.PI*(radius*radius*radius);
			return (4/3)*Math.PI*(radius*radius*radius);
		}
		public double sf() {
			surfacear = 4*Math.PI*(radius*radius);
			return 4*Math.PI*(radius*radius);
		}
		public String toString() {
			return " Shape: "+type+" | Radius = "+radius+" | Surface Area = "+surfacear+" | Volume = "+volume+" | Diameter = "+2*radius; 
		}

	}
	static class octpris3D extends shapes3D{
		public double edge;
		public double lateral;
		public double basearea;
		
		public octpris3D (double edge, double height) {
			this.edge = edge;
			this.height = height;
			type = "Octagonal Prism";
		}
		public octpris3D() {
			edge = 0.0;
			height = 0.0;
			type = "Octagonal Prism";
		}
		public void mute(double edge) {
			this.edge = edge;
		}
		public void muth(double height) {
			this.height = height;
		}
		public double gete() {
			return edge;
		}
		public double geth() {
			return height;
		}
		public double volume() {
			volume = 2*(1+Math.sqrt(2))*(edge*edge)*height;
			return 2*(1+Math.sqrt(2))*(edge*edge)*height;
		}
		public double sf() {
			surfacear = 8*(edge*height)+4*(1+Math.sqrt(2))*(edge*edge);
			return  8*(edge*height)+4*(1+Math.sqrt(2))*(edge*edge);
		}
		public double latsuf() {
			double lat;
			lat = 8*edge*height;
			lateral = lat; 
			return lat;
		}
		public double basearea() {
			basearea = 2*(1+Math.sqrt(2))*(edge*edge);
			return 2*(1+Math.sqrt(2))*(edge*edge);
		}
		public String toString() {
			return " Shape: "+type+" | Edge Length = "+edge+" | Height = "+height+" | Surface Area = "+surfacear+" | Volume = "+volume+" | Lateral Area = "+lateral+" | Base Area = "+basearea; 
		}
	}
	static class lengcl extends shapes3D{
		
		double volume;
		double length;
		double width;
		double basea;
		double baseb;
		double basec;
		double radius;
		double baseegg;
		double height;
			
		public lengcl() {
			volume = 0.0;
			height = 0.0;
			width = 0.0;
			basea = 0.0;
			baseb = 0.0;
			basec = 0.0;
			radius = 0.0;
			baseegg = 0.0;
			}
		public void mutv(double volume) {
			this.volume = volume;
			}
		public void muth(double height) {
			this.height = height;
			}
		public void mutw(double width) {
			this.width = width;
			}
		public void mutr(double radius) {
			this.radius = radius;
			}
		public void mutbasa(double basea) {
			this.basea = basea;
			}
		public void mutbasb(double baseb) {
			this.baseb = baseb;
			}
		public void mutbasc(double basec) {
			this.basec = basec;
			}
		public void basee(double baseegg) {
			this.baseegg = baseegg;
			}
			
		public double recth() {
			height = volume/(length*width);
			return volume/(length*width);
			}
		public double cylh() {
			height = volume/(Math.PI*(radius*radius));
			return volume/(Math.PI*(radius*radius));
			}
		public double tripri() {
			double ab = (basea*baseb)*(basea*baseb);
			double ac = (basea*basec)*(basea*basec);
			double bc = (baseb*basec)*(baseb*basec);
			double a4 = basea*basea*basea*basea;
			double c4 = basec*basec*basec*basec;
			double b4 = baseb*baseb*baseb*baseb;
			height = Math.sqrt(4*(volume/(-a4+2*ab+2*ac-b4+2*bc-c4)));
			return height;
			}
		public double hexpri() {
			height = (2*Math.sqrt(3)*(volume/(9*(baseegg*baseegg))));
			return height;
			}
		public double octpri() {
			height = (volume/(2*(baseegg*baseegg)*(1+Math.sqrt(2))));
			return height;
			}
		public double conepri() {
			height  = 3*(volume/(Math.PI*(radius*radius)));
			return height;
			}
		public double pyrpris() {
			height = 3*(volume/(length*width));
			return height;
			}
	}
	static class hexpris3D extends shapes3D{
		public double edge;
		public double lateral;
		public double basearea;
		
		public hexpris3D (double edge, double height) {
			this.edge = edge;
			this.height = height;
			type = "Hexagonal Prism";
		}
		public hexpris3D() {
			edge = 0.0;
			height = 0.0;
			type = "Hexagonal Prism";
		}
		public void mute(double edge) {
			this.edge = edge;
		}
		public void muth(double height) {
			this.height = height;
		}
		public double gete() {
			return edge;
		}
		public double geth() {
			return height;
		}
		public double volume() {
			double rbyr = 3*Math.sqrt(3);
			double ah = (edge*edge)*height;
			volume = (rbyr/2)*ah;
			return (rbyr/2)*ah;
		}
		public double sf() {
			double rbyr = 3*Math.sqrt(3);
			surfacear = 6*(edge*height)+3*rbyr*(edge*edge);
			return   6*(edge*height)+3*rbyr*(edge*edge);
		}
		public double latsuf() {
			double lat;
			lat = 6*edge*height;
			lateral = lat; 
			return lat;
		}
		public double basearea() {
			double rbyr = 3*Math.sqrt(3);
			basearea = rbyr*((edge*edge)/2);
			return rbyr*((edge*edge)/2);
		}
		public String toString() {
			return " Shape: "+type+" | Edge Length = "+edge+" | Height = "+height+" | Surface Area = "+surfacear+" | Volume = "+volume+" | Lateral Area = "+lateral+" | Base Area = "+basearea; 
		}

	}
	static class heightsolve extends shapes3D{
		double volume;
		double length;
		double width;
		double basea;
		double baseb;
		double basec;
		double radius;
		double baseegg;
		double height;
		
		public heightsolve() {
			volume = 0.0;
			length = 0.0;
			width = 0.0;
			basea = 0.0;
			baseb = 0.0;
			basec = 0.0;
			radius = 0.0;
			baseegg = 0.0;
		}
		public void mutv(double volume) {
			this.volume = volume;
		}
		public void mutl(double length) {
			this.length = length;
		}
		public void mutw(double width) {
			this.width = width;
		}
		public void mutr(double radius) {
			this.radius = radius;
		}
		public void mutbasa(double basea) {
			this.basea = basea;
		}
		public void mutbasb(double baseb) {
			this.baseb = baseb;
		}
		public void mutbasc(double basec) {
			this.basec = basec;
		}
		public void basee(double baseegg) {
			this.baseegg = baseegg;
		}
		
		public double recth() {
			height = volume/(length*width);
			return volume/(length*width);
		}
		public double cylh() {
			height = volume/(Math.PI*(radius*radius));
			return volume/(Math.PI*(radius*radius));
		}
		public double tripri() {
			double ab = (basea*baseb)*(basea*baseb);
			double ac = (basea*basec)*(basea*basec);
			double bc = (baseb*basec)*(baseb*basec);
			double a4 = basea*basea*basea*basea;
			double c4 = basec*basec*basec*basec;
			double b4 = baseb*baseb*baseb*baseb;
			height = Math.sqrt(4*(volume/(-a4+2*ab+2*ac-b4+2*bc-c4)));
			return height;
		}
		public double hexpri() {
			height = (2*Math.sqrt(3)*(volume/(9*(baseegg*baseegg))));
			return height;
		}
		public double octpri() {
			height = (volume/(2*(baseegg*baseegg)*(1+Math.sqrt(2))));
			return height;
		}
		public double conepri() {
			height  = 3*(volume/(Math.PI*(radius*radius)));
			return height;
		}
		public double pyrpris() {
			height = 3*(volume/(length*width));
			return height;
		}
	}
	static class cyl3D extends shapes3D{
		
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
	static class cone3D extends shapes3D{
		public double radius;
		public double lateral;
		public double basearea;
		public double slantheight;
		
		public cone3D (double radius, double height) {
			this.radius = radius; 
			this.height = height;
			type = "Cone";
		}
		public cone3D() {
			radius = 0.0;
			height = 0.0;
			type = "Cone";
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
			volume = Math.PI*(radius*radius)*(height/3);
			return Math.PI*(radius*radius)*(height/3);
		}
		public double sf() {
			surfacear = Math.PI*radius*(radius+Math.sqrt((height*height)+(radius*radius)));
			return Math.PI*radius*(radius+Math.sqrt((height*height)+(radius*radius)));
		}
		public double latsuf() {
			double lat;
			lat = Math.PI*radius*Math.sqrt((height*height)+(radius*radius));
			lateral = lat; 
			return lat;
		}
		public double basearea() {
			basearea = Math.PI*(radius*radius);
			return Math.PI*(radius*radius);
			}
		public double slantheight() {
			slantheight = Math.sqrt((radius*radius)+(height*height));
			return  Math.sqrt((radius*radius)+(height*height));
		}
		public String toString() {
			return " Shape: "+type+" | Radius = "+radius+" | Surface Area = "+surfacear+" | Volume = "+volume+" | Diameter = "+2*radius+" | Lateral Area = "+lateral+" | Slant Height = "+slantheight; 
		}
	}


	

		
}
