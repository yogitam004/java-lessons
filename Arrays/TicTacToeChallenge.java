import java.util.Random;
public class TicTacToeChallenge {
    public static void main(String args[]) {
        char[][] challenge = new char[3][3];
        int trackX = 0;
        int track0 = 0;

        for (int i = 0; i < challenge.length; i++) {
            for (int j = 0; j < challenge[i].length; j++) {
                Random random = new Random();
                int result = random.nextInt(1);
               
                if (result == 0) { 
                    if (trackX < 5) {
                        challenge[i][j] = 'x';
                        trackX += 1;
                    } else {
                        challenge[i][j] = 'o';
                        track0 += 1;
                    }

                }
                if (result == 1) {
                    if (track0 < 5){
                        challenge[i][j] = 'o';
                        track0 +=1;
                    } else {
                        challenge[i][j] = 'x';
                        trackX += 1;
                    }
                    
                }
                }
                
            }
        
        for (int i = 0; i < challenge.length; i++) {
            for (int j = 0; j < challenge[i].length; j++) {
                System.out.print("\t" + challenge[i][j]);
            }
            System.out.println();
        }

        String w1 = "" + challenge[0][0] + challenge[0][1] + challenge[0][2];
                if (w1.equalsIgnoreCase( "xxx")) {
                    System.out.println("x has won!");
                } else if (w1.equalsIgnoreCase("ooo")){
                    System.out.println("o was won!");
                }
        String w2 = "" + challenge[1][0] + challenge[1][1] + challenge[1][2];
                if (w2.equalsIgnoreCase( "xxx")) {
                    System.out.println("x has won!");
                } else if (w2.equalsIgnoreCase("ooo")){
                    System.out.println("o was won!");
                }
        String w3 = "" + challenge[2][0] + challenge[2][1] + challenge[2][2];
                if (w3.equalsIgnoreCase( "xxx")) {
                    System.out.println("x has won!");
                } else if (w3.equalsIgnoreCase("ooo")){
                    System.out.println("o was won!");
                }
        String w4 = "" + challenge[0][0] + challenge[1][0] + challenge[2][0];
                if (w4.equalsIgnoreCase( "xxx")) {
                    System.out.println("x has won!");
                } else if (w4.equalsIgnoreCase("ooo")){
                    System.out.println("o was won!");
                }
        String w5 = "" + challenge[0][1] + challenge[1][1] + challenge[2][1];
                if (w5.equalsIgnoreCase( "xxx")) {
                    System.out.println("x has won!");
                } else if (w5.equalsIgnoreCase("ooo")){
                    System.out.println("o was won!");
                }
        String w6 = "" + challenge[0][2] + challenge[1][2] + challenge[2][2];
                if (w6.equalsIgnoreCase( "xxx")) {
                    System.out.println("x has won!");
                } else if (w6.equalsIgnoreCase("ooo")){
                    System.out.println("o was won!");
                }

        

        

       
        
        }
    }

