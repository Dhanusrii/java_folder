package java_programs;

public class TypeCasting {
	 public static void main(String[] args) {
	        // Implicit Type Casting
	        int intValue = 100;
	        double doubleValue = intValue; // int is implicitly cast to double

	        System.out.println("Implicit Type Casting :");
	        System.out.println("int value: " + intValue);
	        System.out.println("double value: " + doubleValue);

	        // Explicit Type Casting (Narrowing Conversion)
	        double pi = 3.14159265359;
	        int intPi = (int) pi; // double is explicitly cast to int

	        System.out.println("\nExplicit Type Casting :");
	        System.out.println("double value (pi): " + pi);
	        System.out.println("int value (intPi): " + intPi);
	    }

}
