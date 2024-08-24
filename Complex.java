
public class Complex {

	private double a;
	private double b;
	
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public Complex(double a) {
		this.a = a;
	}
	
	public double getRe() {return a;}
	public double getIm() {return b;}
	
	public double abs() {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b,  2));
	}
	public static Complex add(Complex c1, Complex c2) {
        Complex com = new Complex(0, 0);
        com.a = c1.a + c2.a;
        com.b = c1.b + c2.b;
        return com;
	}
	public static Complex subtract(Complex c1, Complex c2) {
        Complex com = new Complex(0, 0);
        com.a = c1.a - c2.a;
        com.b = c1.b - c2.b;
        return com;
	}
	public static Complex multiply(Complex c1, Complex c2) {
        Complex com = new Complex(0, 0);
        com.a = (c1.a * c2.a) - (c1.b * c2.b);
        com.b = (c1.a * c2.b) + (c1.b * c2.a);
        return com;
	}
	public static Complex divide(Complex c1, Complex c2) {
        Complex com = new Complex(0, 0);
        com.a = ((c1.a * c2.a) + (c1.b * c2.b)) / ((c2.a * c2.a) + (c2.b * c2.b));
        com.b = ((c1.b * c2.a) - (c1.a * c2.b)) / ((c2.a * c2.a) + (c2.b * c2.b));
        return com;
	}
	public String toString() {
		return "(" + a + " + " + b + "i)";
	}
	
	public static void main(String[] args) {
		Complex c1 = new Complex(3, 2);
		Complex c2 = new Complex(3, -2);
		
		Complex a = add(c1, c2);
		Complex s = subtract(c1, c2);
		Complex m = multiply(c1, c2);
		Complex d = divide(c1, c2);
		
		System.out.println(c1 + " + " + c2 + " = " + a);
		System.out.println(c1 + " - " + c2 + " = " + s);
		System.out.println(c1 + " * " + c2 + " = " + m);
		System.out.println(c1 + " / " + c2 + " = " + d);
	}
}
