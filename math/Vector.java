package math;

import java.util.ArrayList;

public class Vector {
	public double a;
	public double b;
	public double c;
	static ArrayList<Vector> storage = new ArrayList<>();
	
	
	public Vector(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c; 
	}
	
	public Vector() {
		a = 0;
		b = 0;
		c = 0;
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
	public String toString() {
		return "<"+a+", "+b+", "+c+">";
	}
	public static ArrayList<Vector> storvect(Vector shape){
		storage.add(shape);
		return storage;
	}
	public static ArrayList<Vector> clearvect(){
		storage.clear();
		return storage;
	}
	
	
}
