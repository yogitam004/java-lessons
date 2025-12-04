// Java is a STRONGLY TYPED language;
// Therefore you have to declare/define by including the data type;
// Primitive data types are floats, integers, strings, and boolean;
// But a string is not natively included within java however characters are;


class DataTypeExamples {
    int myInt = 42;
    double myDouble = 189.75;
    // Called a double because it has double the amount of bytes that are used to store this data. Allows more precision.
    char myChar = 'Q';
    // Character is single quotes and String is double quotes.
    boolean myBool = false;
    // You don't have capitalize when you are coding true or false. 
}

public class DataTypes {

    public static void main(String[] args) {
        DataTypeExamples dt = new DataTypeExamples();
        System.out.println("myInt: " + dt.myInt);
        System.out.println("myDouble: " + dt.myDouble);
        System.out.println("myChar: " + dt.myChar);
        System.out.println("myBool: " + dt.myBool);

    }
}