import java.util.*;
public class OperationComplex {

	public static void main(String[] args) {
		final char n = 'n';
		final char add = '+';
		final char sub = '-';
		final char mult = '*';
		final char div = '/';
		final char q = 'q';
		Complex c = new Complex(1, 1);
		Complex c1 = new Complex(0, 0);
		System.out.println("Current Global Value: " + c);
		char choice;
		double a;
		double b;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("-----------------------------------------------" + "\n\t\tMain Menu\n" 
					+ "-----------------------------------------------");
			System.out.println("n: New Complex Value\n+: Add a Complex to the current value"
					+ "\n-: Subtract a Complex from the current value"
					+ "\n*: Multiply a Complex to the current value"
					+ "\n/: Divide a Complex to the current value\nq: Quit");
			System.out.print("Enter a command: ");
			choice = input.next().charAt(0);
			switch(choice) {
			case n:
				System.out.println("Enter 2 doubles for real & imaginary of new complex number: ");
				a = input.nextDouble();
				b = input.nextDouble();
				c = new Complex(a, b);
				System.out.println("New Global Value: " + c);
				break;
			case add:
				System.out.println("Enter 2 doubles for real & imaginary for a complex number to add: ");
				a = input.nextDouble();
				b = input.nextDouble();
				c1 = new Complex(a, b);
				System.out.println(c + " + " + c1 + " = " + Complex.add(c, c1));
				c = Complex.add(c, c1);
				System.out.println("New Global Value: " + c);
				break;
			case sub:
				System.out.println("Enter 2 doubles for real & imaginary for a complex number to subtract: ");
				a = input.nextDouble();
				b = input.nextDouble();
				c1 = new Complex(a, b);
				System.out.println(c + " - " + c1 + " = " + Complex.subtract(c, c1));
				c = Complex.subtract(c, c1);
				System.out.println("New Global Value: " + c);
				break;
			case mult:
				System.out.println("Enter 2 doubles for real & imaginary for a complex number to multiply: ");
				a = input.nextDouble();
				b = input.nextDouble();
				c1 = new Complex(a, b);
				System.out.println(c + " * " + c1 + " = " + Complex.multiply(c, c1));
				c = Complex.multiply(c, c1);
				System.out.println("New Global Value: " + c);
				break;
			case div:
				System.out.println("Enter 2 doubles for real & imaginary for a complex number to divide: ");
				a = input.nextDouble();
				b = input.nextDouble();
				c1 = new Complex(a, b);
				System.out.println(c + " / " + c1 + " = " + Complex.divide(c, c1));
				c = Complex.divide(c, c1);
				System.out.println("New Global Value: " + c);
				break;
			case q:
				System.out.println("End of Program");
				break;
			}
		}while (choice != q);
		input.close();
	}

}
