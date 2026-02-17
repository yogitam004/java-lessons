public class GetSetTester {
    public static void main(String[] args) {
        //create a new object for my GetSet class
        GetSet name = new GetSet();
        System.out.println(name.getUsername());
        name.setUsername("pineappleghost333");
        System.out.println(name.getUsername());


    }
}

class GetSet{
    //instance variables; attributes
    //default value for the string is null
    private String username;

    //accesor methods aka GETTERs
    public String getUsername() {
        return username;
    }

    public void setUsername(String newUsername) {
        this.username = newUsername;
    }
}
