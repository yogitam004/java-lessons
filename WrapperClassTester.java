public class WrapperClassTester {
    public static void main(String[] args) {
        Wrapper.demoInteger();
        Wrapper.demoBoolean();

    }
}

class Wrapper {
    //demo Integer, Double, and Boolean in seperate methods

    public static void demoInteger() {

        int primitiveInt = 10;
        Integer myInt = 5;

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + myInt);

        System.out.println("Max int value: " + Integer.MAX_VALUE);
        System.out.println("Min int value: " + Integer.MIN_VALUE);

        int parsed = Integer.parseInt("25");
        int add = parsed + 5;
        System.out.println("Parsed from String: " + parsed);
        System.out.println("Added from String: " + add);
    }

    public static void demoBoolean() {
       
        boolean primitiveBool = true;
        // you can make the code line below just like what we did witn Integer in the above lines
        Boolean wrapperBool = Boolean.valueOf(true);

        System.out.println("Primitive boolean: " + primitiveBool);
        System.out.println("Wrapper Boolean: " + wrapperBool);

        boolean parsed = Boolean.parseBoolean("false");
        System.out.println("Parsed bool: " + parsed);

    }

    public static void autoBoxingDemo(){

        //Autoboxing - takes prmitive data type --> wraps it in in Integer class
        Integer num = 5;

        //Unboxing - wrapper --> primitive
        int value = num;
    }
}
