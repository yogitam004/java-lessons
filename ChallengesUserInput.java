import java.util.Scanner;
public class ChallengesUserInput {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      //Challenge 1

      //System.out.println("Enter one word: ");
      //String one = input.nextLine();
      //System.out.println("Enter another word: ");
      //String two = input.nextLine();

      //System.out.println("Enter a number:");
      //String num1 = input.nextLine();
      //int num1Converted  = Integer.parseInt(num1);

      //System.out.println("Enter another number:");
      //String num2 = input.nextLine();
      //int num2Converted  = Integer.parseInt(num2);

      //if ((num1Converted + num2Converted) < 100) {
        //System.out.println(one + two + (num1Converted + num2Converted) + "@gmail.com");
      //}

      //Challenge 1: Conditionals

      String password = "Hellothisisthepassword";

      System.out.println("Enter the password: ");
      String newpassword = input.nextLine();

      if (password.equals(newpassword)) {
        System.out.println("Access granted");
      }else{
        System.out.println("Access denied");
      }

      //Challenge 2: Conditionals

     System.out.println("Enter a number: ");
     int num1 = input.nextInt();

     if ((num1)%2 != 0) {
      System.out.println("The number you entered is odd.");
     } else {
      System.out.println("The number you entered is even.");
     }

     //Challenge 3: Conditionals
     System.out.println("Enter a number grade: ");
     int grade = input.nextInt();

     if (grade>= 90) {
      System.out.println("Grade: A");
     } else if (grade>=80 && grade<90){
      System.out.println("Grade: B");
     } else if (grade >= 70  && grade <80) {
      System.out.println("Grade: C");
     } else if (grade>= 60 && grade < 70) {
      System.out.println("Grade: D");
     } else {
      System.out.println("You failed :(");
     }



    }
}
