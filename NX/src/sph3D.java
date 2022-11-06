public class sph3D extends shapes3D{
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