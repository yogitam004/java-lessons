// lesson on accumulation and increment/decrement
class ScoreBoard {
    int playerXP = 0;
    int playerLevel = 0;
    int health = 0;
    String username;

    static String game = "Jumanji";

    public ScoreBoard(String username) {
        this.username = username;
    }

    void gainXP(int amount) {
        playerXP = playerXP + amount;//accumulation
        System.out.println("Player Name: " + username + " XP gained: " + amount );
    }

    // void doesn't mean there isn't a return type. Void is a return type for nothing. 

    void heal(){
        health += 50; // the way you should do accumulation. This is called compound accumulation.
    }

    void damage() {
        health -= 10; //compound subtraction
    }

    //note: you can also use *=, /=, or %=

    void levelUp() {
        playerLevel++;//increment
    }

    void levelDown() {
        playerLevel --; //decrement
    }

    //increment = go up by ONE
    //decrement = go down byb ONE
    void getName() { //void becaue technically not returning anything, it is printing
        System.out.println(game);
    }
   

}
public class Math2{
    public static void main(String[] args){

        ScoreBoard player1 = new ScoreBoard("Leah");

        ScoreBoard player2 = new ScoreBoard("Mark");

        player1.gainXP(100);
        player1.gainXP(200);
        player1.heal();
        player1.damage();
        player1.levelUp();
        player1.levelUp();
        player1.levelDown();

        System.out.println("Player 1 XP: " + player1.playerXP);
        System.out.println("Player 1 Level: " + player1.playerLevel);
         System.out.println("Player 1 Health: " + player1.health);

        player2.gainXP(100);
        player2.gainXP(300);
        player2.heal();
        player2.levelUp();
        player2.levelUp();
        player2.levelDown();

        System.out.println("Player 2 XP: " + player2.playerXP);
        System.out.println("Player 2 Level: " + player2.playerLevel);
        System.out.println("Player 2 Health: " + player2.health);

        player1.getName();
    
    }
}