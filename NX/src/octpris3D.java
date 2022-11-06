public class octpris3D extends shapes3D{
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