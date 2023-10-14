package java_programs;


public class Encapsulation {
    public static void main(String[] args) {
    	Student student = new Student();
    	
        student.setName("Ram");
        student.setAge(25);

        System.out.println("Updated name: " + student.getName());
        System.out.println("Updated age: " + student.getAge());
    }
}
