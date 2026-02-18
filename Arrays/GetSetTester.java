import java.util.Scanner;
public class GetSetTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //create a new object for my GetSet class
        GetSet player1 = new GetSet();
        GetSet player2 = new GetSet();

        System.out.println(player1.getUsername());//displays default username value of null
        player1.setUsername("pineappleghost333"); // sets (or mutates) username to new value
        System.out.println(player1.getUsername()); //displays new username

        System.out.println(player2.getUsername());//displays default username value of null
        player2.setUsername("ironmouse6741"); // sets (or mutates) username to new value
        System.out.println(player2.getUsername()); //displays new username

        //taking in user input
        GetSet player3 = new GetSet();
        System.out.print("Enter a username: ");
        String userInput = input.nextLine();
        player3.setUsername(userInput);

        System.out.println(player3.getUsername()); //displays new username

        //testing the challenges for the variables ID and rank

        System.out.println(player1.getID());
        player1.setID(12345);
        System.out.println(player1.getID());

        System.out.println(player1.getRank());
        player1.setRank("noob");
        System.out.println(player1.getRank());

        //taking in user input for ID and rank for player 2 
        System.out.println("Enter you rank (noob, bruh, novice, hacker,gawd): ");
        String userRank = input.nextLine();
        player2.setRank(userRank);
        System.out.println("Enter your ID: ");
        int userID = input.nextInt();
        player2.setID(userID);

        System.out.println("Player 2 Rank: " + player2.getRank());
        System.out.println("Player 2 ID: " + player2.getID());

        //conditional logic - remember .equals to compare String values bc otherwise checking for memory location. 

        if (player1.getRank().equals("noob")) {
            System.out.println("For now you are a noob, but one day you will be powerful!");
        } else if (player1.getRank().equals("bruh")) {
            System.out.println("You are a bruh, but at least you are not a noob.");
        } else if (player1.getRank().equals("novice")) {
            System.out.println("So close to being a gawd now! Work hard to improve your level from novice.");
        } else if (player1.getRank().equals("hacker")) {
            System.out.println("You are one powerful hacker!");
        } else {
            System.out.println("Wow! You are a gawd now!");
        }

        input.close();
    }
}

class GetSet{
    //instance variables; attributes; making the instance 'private' enforces ENCAPSULATION
    //default value for the string is null
    private String username;
    private int ID;
    private String rank; // (5 ranks: noob, bruh, novice, hacker, gawd)

    //accesor methods aka GETTERs
    public String getUsername() {
        return username;
    }
    //mutator methods aka SETTERs
    public void setUsername(String newUsername) {
        this.username = newUsername;
    }

    //challenge to get and set the variables ID  and rank

    //ID:
    public int getID() {
        return ID;
    }

    public void setID(int newID) {
        this.ID = newID;
    }

    //rank:
    public String getRank() {
        return rank;
    }

    public void setRank(String newRank) {
        this.rank = newRank;
    }
}
