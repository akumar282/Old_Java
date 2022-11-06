public class rectpry3D extends shapes3D{
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