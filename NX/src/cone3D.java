public class cone3D extends shapes3D{
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
