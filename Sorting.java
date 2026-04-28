import java.util.Arrays;
// Variables: n = length of the list, i = index of outer loop, j = index of inner loop, 
// Swap: temp = stores the variable temporarily to swap two values
// Selection Sort = i iterates across the list while j starts at a variable that is not i; needs a variable called minIndex

public class Sorting { 
    public static void main(String[] args) {
        int[] swapNumbers = {9, 3};   
        int[]  selectionNumbers = {9,3,1,5,10,2,4,8,7,6};

        SortingAlgorithms swap = new SortingAlgorithms(swapNumbers);
        SortingAlgorithms selection = new SortingAlgorithms(selectionNumbers);

        //Java prints out the reference in memory so you must convert the array to a string
        System.out.println("Before swap: " + Arrays.toString(swapNumbers));
        swap.swapNumbers();
        System.out.println("After swap: " + Arrays.toString(swapNumbers));

        System.out.println("Before selection: " + Arrays.toString(selectionNumbers));
        selection.selectionSort();
        System.out.println("After selection: " + Arrays.toString(selectionNumbers));
    }
    
}

class SortingAlgorithms { 
    //data or attributes 
    private int[] list; 

    //constructor 
    public SortingAlgorithms(int[] list) { 
        this.list = list;
    }

    //behaviors
    public void swapNumbers() { 
        int temp = list[0];
        list[0] = list[1];
        list[1] = temp;
    }

    public void selectionSort() { 
        int n = list.length;
        System.out.println("Length of list: " + n); 

        //outer loop
        for (int i = 0; i < n; i++) { 
            int minIndex = i; 

            //inner loop
            for (int j = i + 1; j < n; j++) { 
                //conditional logic to compare values 
                 if (list[j] < list[minIndex]) {
                    minIndex = j; 
                 }
            }
            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }

    }
            
    
}