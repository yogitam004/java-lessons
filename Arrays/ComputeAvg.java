import java.util.Scanner;
public class ComputeAvg {
    public static void main(String args[]) {
        double[] scores = new double[5];
        double sum = 0.0, avg = 0.0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the scores of the 5 tests: ");
        for(int i = 0; i < scores.length; i++) {
            scores[i] = keyboard.nextInt();
        }
        System.out.println("Display the scores:")
        for(int i=0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        for(int i = 0; i < scores.length; i++) {
            sum = sum + scores[i]
        }



    }
}
