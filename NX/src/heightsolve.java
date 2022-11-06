public class heightsolve extends shapes3D{
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