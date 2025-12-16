public class Conditionals {
    public static void main (String[] args) {
        //Basic Booleans
        System.out.println("Double equals: " + (3 == 2));
        System.out.println("String equivalent: " + "Hello".equals("Hi there") );
        System.out.println("Not equals: " + (7 != 4));
        System.out.println("Greater than: " + (4 > 5));
        System.out.println();

        //if statement
        int num = 13;
        System.out.println(num <= 12);
        if(num <=12) {
            System.out.println("num is less than or equal to 12");
        }

        //if else statement
        if (num <= 5) {
            System.out.println("num is less than or equal to 5");
        } else {
            System.out.println("yay you did it!  num is greater than 5");
        }

        //if....else-if.....else
        int temperature =93;
        if(temperature >= 85) {
            System.out.println("It's hot!");
        } else if(temperature >= 60) {
            System.out.println("It's nice!");
        } else if(temperature < 40 ) {
            System.out.println("It's cold!");
        } else {
            System.out.println("ERROR!");
        }

        // Logical "and" operatore: &&

        int age = 17;
        boolean hasPermit = true;

        if (age>=17 && hasPermit == true){
            System.out.println("You can drive.");
        } else {
            System.out.println("You cannot drive yet.");
        }

        // Using "or" || operator

        String day = "Saturday";

        if (day.equals("Saturday") || day.equals("Sunday")) {
            System.out.println("It is the weekend!");
        } else if (day.equals("Monday") || 
                    day.equals("Tuesday") || 
                    day.equals("Wednesday") || 
                    day.equals("Thursday") || 
                    day.equals("Friday")) {
            System.out.println("It is not the weekend...");
        }else {
            System.out.println("ERROR! That is not a day.");
        }
    }
}
