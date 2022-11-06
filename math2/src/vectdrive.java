import java.util.ArrayList;
import java.util.Scanner;


public class vectdrive {

	public static void main(String[] args) {
		System.out.println("Vector Calculator");

		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Operation?");
			String opp = input.nextLine();
			
			if(opp.equals("crosspro")) {
				System.out.println("Vector 1:");
				Vector v1 = new Vector();
				double mut = input.nextDouble();
				v1.muta(mut);
				mut = input.nextDouble();
				v1.mutb(mut);
				mut = input.nextDouble();
				v1.mutc(mut);
				Vector v2 = new Vector();
				System.out.println("Vector 2:");
				mut = input.nextDouble();
				v2.muta(mut);
				mut = input.nextDouble();
				v2.mutb(mut);
				mut = input.nextDouble();
				v2.mutc(mut);
				System.out.println(crosspro(v1, v2));	
			}
			if(opp.equals("dotpro")) {
				System.out.println("Vector 1:");
				Vector v1 = new Vector();
				double mut = input.nextDouble();
				v1.muta(mut);
				mut = input.nextDouble();
				v1.mutb(mut);
				mut = input.nextDouble();
				v1.mutc(mut);
				Vector v2 = new Vector();
				System.out.println("Vector 2:");
				mut = input.nextDouble();
				v2.muta(mut);
				mut = input.nextDouble();
				v2.mutb(mut);
				mut = input.nextDouble();
				v2.mutc(mut);
				System.out.println(dotpro(v1, v2));
			}
		}while (1 == 1);

	}
	public static String crosspro(Vector v1, Vector v2) {
		double cva = (v1.b*v2.c)-(v1.c*v2.b);
		double cvb = (v1.c*v2.a)-(v1.a*v2.c);
		double cvc = (v1.a*v2.b)-(v1.b*v2.a);
		System.out.println("<a2*b3 - a3*b2, a3*b1 - a1*b3 , a1*b2 - a2*b1>");
		System.out.println("<"+v1.b+"*"+v2.c+" - "+v1.c+"*"+v2.b+", "+v1.c+"*"+v2.a+" - "+v1.a+"*"+v2.c+", "+v1.c+"*"+v2.a+" - "+v1.a+"*"+v2.c+">");
		System.out.println("<"+(v1.b*v2.c)+"-"+(v1.c*v2.b)+", "+(v1.c*v2.a)+"-"+(v1.a*v2.c)+", "+(v1.a*v2.b)+"-"+(v1.b*v2.a)+">");
		System.out.println();
		System.out.println("|  i   j   k  |");
		System.out.println("| "+v1.a+" "+v1.b+" "+v1.c+" |  = i | "+v1.b+" "+v1.c+" | - j | "+v1.a+" "+v1.c+" | + k | "+v1.a+" "+v1.b+" |");
		System.out.println("| "+v2.a+" "+v2.b+" "+v2.c+" |      | "+v2.b+" "+v2.c+" |     | "+v2.a+" "+v2.c+" |     | "+v2.a+" "+v2.b+" |");
		System.out.println();
		return "Cross Product: <"+cva+", "+cvb+", "+cvc+">";
	}
	public static String dotpro(Vector v1, Vector v2) {
		Double pro = (v1.a*v2.a)+(v1.b*v2.b)+(v1.c*v2.c);
		System.out.println((v1.a*v2.a)+"+"+(v1.b*v2.b)+"+"+(v1.c*v2.c));
		return "Dot Product: "+pro;
	}
	public static String subv(Vector v1, Vector v2) {
		return "<"+(v1.a-v2.a)+", "+(v1.b-v2.b)+", "+(v1.c-v2.c)+">";
	}
	public static String addv(Vector v1, Vector v2) {
		return "<"+(v1.a+v2.a)+", "+(v1.b+v2.b)+", "+(v1.c+v2.c)+">";
	}
	static class Vector {
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

}
