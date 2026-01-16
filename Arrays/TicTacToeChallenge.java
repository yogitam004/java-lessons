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
        
        }
    }

