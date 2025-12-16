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

      String password = "Hellothisisthepassword";

      System.out.println("Enter the password: ");
      String newpassword = input.nextLine();

      if (password.equals(newpassword)) {
        System.out.println("Access granted");
      }else{
        System.out.println("Access denied");
      }

     System.out.println("Enter a number: ");
     int num1 = input.nextLine();

    }
}
