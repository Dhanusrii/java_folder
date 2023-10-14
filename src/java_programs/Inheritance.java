package java_programs;

//Define the first interface
interface Shape {
 double getArea();
}

//Define the second interface
interface Color {
 String getColor();
}

//Create a class that implements both interfaces
class Circle implements Shape, Color {
 private double radius;
 private String color;

 public Circle(double radius, String color) {
     this.radius = radius;
     this.color = color;
 }


 public double getArea() {
     return Math.PI * radius * radius;
 }


 public String getColor() {
     return color;
 }
}

public class Inheritance {
 public static void main(String[] args) {
     Circle circle = new Circle(5.0, "Red");
     System.out.println("Area: " + circle.getArea());
     System.out.println("Color: " + circle.getColor());
 }
}
