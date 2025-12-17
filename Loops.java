public class Loops {
    public static void main(String[] args) {
        //-- would be decreasing by one
        //++ would be increasing by one
        //-= 2 would be for example decreasing by two, you can use this structure
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int b = 0; b < 5; b++) {
            for(int j = 0; j<5; j+= 1) {
                System.out.println(j);
            }
        }

        //break - stops the loop entirely
        //continue - it would go to the next iteration of the loop
        //return - stops the program entirely

        //you can use nested loops for creating tables for iterating each column


        //while only take in booleans
        int i = 0;
        while (i<5) {
            System.out.println("True");

            i++;
        }

        boolean isContinuing = true;

        int z = 0;

        while (isContinuing) {
            z++;
            if (z==20) {
                isContinuing = false;
            }
            System.out.println(z);
        }
        

        //Foodbar
        //1 to 100
        // i% 3 print food
        // i% 5 print bar
        // if both divisible print foodbar

        for (int e = 0; e <= 100; e++) {
            if (e%3 == 0 && e%5 == 0) {
                System.out.println("Foodbar");
            } else if (e%3 == 0) {
                System.out.println("Bar");
            } else if (e%5 == 0) {
                System.out.println("Food");
            }
        }

    }
}
