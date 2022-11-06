public class tripris3D extends shapes3D {
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