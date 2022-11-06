public class hexpris3D extends shapes3D{
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
