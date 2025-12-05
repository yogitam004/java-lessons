class Calculator {
    // write functions for addition, subtraction, multiplication, division, etc.
    // Types of Division: Integer division (5/2 = 2) and Float division 
     int add(int a, int b) { //add the return type!!
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a*b; //use asterisk for multiplication in java
    }

    int multiply(int a, int b, int c) {
        return a*b*c;
    }

    int divide(int a, int b) {
        return a/b;
    }
    //demonstrates polymorphism (allows objects to take many forms)
    double divide(double a, double b) {
        return a/b;
    }

    int modulo(int a, int b) { // gives you the remainder of a division
        return a % b;
    }
}
public class Math1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(10,5));
        System.out.println(calc.subtract(10,5));
        System.out.println(calc.multiply(10,5));
        System.out.println(calc.divide(10.6,5.3)); //java knows which divide to use because of polymorphism aka method overriding
        System.out.println(calc.modulo(10,5));

        System.out.println(calc.add(10.5, 5.6));
        System.out.println(calc.multiply(10,2,5));
    }
}
