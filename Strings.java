public class Strings {
    public static void mian(String[] args) {
        String nameObj = new String("Didi");
        // D i d i - like a list of characters
        // 0 1 2 3

        String name1 = "Didi";
        String name2 = "Gogo";
        String name3 = "Gogo";

        //first line will be false

        System.out.println("name1 + name2: " + name1.equals(name2));

        System.out.println("name1 + nameObj: " + name1.equals(nameObj));
    }
    
}
