public class ArraysFourPractice {
    public static void main(String args[]) {
        //Practice Problem 1: 
        double[] winners = new double[18];
        //Pracice Problem 2:
        int[] first_array = {2,3,5,7,11,13,17,19};
        //Practice Problem 3: 
        int[] nums = new int[20];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 2*i;
        }
        //Practice Problem 4: 
        int[][] maze = new int[30][40];
        //Practice Problem 5: 
        int[][] array = new int[16][32];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.println();
            }
        }
        //Practice Problem 6: 
        //This code prints 2,3,1 then 2,2,1 then 0,2,3 then 1,0,4 with lines in between them (each number is on a seperate line). 
        //Practice Problem 7: 
        //This code prints 0. 
        //Practice Problem 8: 
        //This code prints 12,8,6 then 8,6,4. Each number is on a seperate line. 

    }
}
