package java_programs;

//Abstract class with an abstract method
abstract class Art {
 public abstract void draw(); // Abstract method, no implementation provided
}

//Concrete subclass that extends the abstract class
class Triangle extends Art {
 @Override
 public void draw() {
     System.out.println("Drawing a Triangle");
 }
}

//Concrete subclass that extends the abstract class
class Rectangle extends Art {
 @Override
 public void draw() {
     System.out.println("Drawing a Rectangle");
 }
}

public  class Abstraction{
 public static void main(String[] args) {
     Art triangle = new Triangle();
     Art rectangle = new Rectangle();
     
     triangle.draw();  
     rectangle.draw();
 }
}
