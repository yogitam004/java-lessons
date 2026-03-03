
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<Integer>(5); // Make sure you input it in both, especially the first blank. THEY HAVE TO BE THE SAME type!
        System.out.println(list);
        System.out.println(list.size());

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(list.size());
 
        list.add(3, 5); // adding 5 to the index 1 - also overrides (polymorphism)
        System.out.println(list);

        System.out.println(list.get(5)); //It will tell you what value is at that index. 

        list.remove(1); // removes the value at index 1, so the array list will become smaller. 

        list.add(1,5);
        list.add(2,5);
        list.remove(Integer.valueOf(5)); // removes the first instance of the number. 

        System.out.println(list.contains(5)); //returns boolean value if that number is present in the array list. 

        Collections.sort(list); //sort the list
        Collections.binarySearch(list, 4); //gives us the value at key 4

        System.out.println(list.toString());

        Integer[] arr = list.toArray(new Integer[0]);
        for (int val: arr) {
            System.out.print(val + " ");
        }

        ArrayList<Integer> splitList = new ArrayList<Integer>(list.subList(3,list.size()));
        System.out.println(splitList);

        list.clear();//removes every element from the list
        
    }
    
}


