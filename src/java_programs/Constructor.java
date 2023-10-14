package java_programs;

class Person {
    private String name;
    private int age;

    // Constructor with parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor without parameters (default constructor)
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Create objects using constructors
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person();

        // Display information
        System.out.println("Person 1:");
        person1.display();

        System.out.println("\nPerson 2:");
        person2.display();
    }
}
