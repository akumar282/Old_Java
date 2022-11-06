import java.util.ArrayList;

public class shapes3D {
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

