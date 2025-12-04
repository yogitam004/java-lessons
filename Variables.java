// Two types of variables: static and instance(dynamic)
// Variables use camelCase
// Constants use uppercase and snake case.
class Student {
    String studentName; // instance variable  - belongs to the instance(object)
    static int studentCount = 0; // static variable - doesn't belong to every object created; belongs to the class
    static final String SCHOOL_NAME = "CSAEA"; // constant
    
    Student(String n) {
        studentName = n;
        System.out.println(n + " is a student at " + SCHOOL_NAME);
        studentCount++;
        System.out.println("Number of students: " + studentCount);
    }


}
public class Variables {
    public static void main(String[] args) {

        // just created a new  student without creating an associated variable.
        new Student("Alex");
        new Student("Emily");
        new Student("Nick Simion");
        new Student("Neville");
        new Student("Harry");
        new Student("Alice");
    }
}
