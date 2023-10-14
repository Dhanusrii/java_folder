package java_programs;

public class MethodOverloading {
	 // Method with two integers as parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with three integers as parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two doubles as parameters
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading calculator = new MethodOverloading();

        System.out.println("Sum of two integers: " + calculator.add(5, 10));
        System.out.println("Sum of three integers: " + calculator.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + calculator.add(3.5, 2.2));
    }
}


