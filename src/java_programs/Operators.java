package java_programs;

public class Operators {
	 public static void main(String[] args) {
	        // Arithmetic Operators
	        int num1 = 10;
	        int num2 = 5;
	        int sum = num1 + num2;
	        int difference = num1 - num2;
	        int product = num1 * num2;
	        int quotient = num1 / num2;
	        int modulus = num1 % num2;

	        System.out.println("Arithmetic Operators:");
	        System.out.println("Sum: " + sum);
	        System.out.println("Difference: " + difference);
	        System.out.println("Product: " + product);
	        System.out.println("Quotient: " + quotient);
	        System.out.println("Modulus: " + modulus);

	        // Relational Operators
	        boolean isEqual = num1 == num2;
	        boolean isNotEqual = num1 != num2;
	        boolean isGreaterThan = num1 > num2;
	        boolean isLessThan = num1 < num2;

	        System.out.println("\nRelational Operators:");
	        System.out.println("Equal: " + isEqual);
	        System.out.println("Not Equal: " + isNotEqual);
	        System.out.println("Greater Than: " + isGreaterThan);
	        System.out.println("Less Than: " + isLessThan);

	        // Logical Operators
	        boolean a = true;
	        boolean b = false;
	        boolean andResult = a && b;
	        boolean orResult = a || b;
	        boolean notResult = !a;

	        System.out.println("\nLogical Operators:");
	        System.out.println("AND Result: " + andResult);
	        System.out.println("OR Result: " + orResult);
	        System.out.println("NOT Result: " + notResult);
	    }
	}



