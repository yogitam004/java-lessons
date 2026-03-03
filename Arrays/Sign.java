public class Sign {
    private String message;
    private int width;

    public Sign (String message, int width) {
        this.message = message;
        this.width = width;
    }

    public void numberOfLines() {
        double len = message.length();
        if (len < width) {
            System.out.println("1");
        } else {
            double lines = len/width;
            System.out.println(Math.round(lines));
        }
    }

    public void getLines(){
        if (width == message.length() || width > message.length()) {
           System.out.println(message); 
        } else {
        for (int i =0; i <= message.length(); i+=width) {
           if ((i+width) < message.length()) {
            String extracted = message.substring(i,i+width); 
           System.out.print(extracted + ";");
           } }
        System.out.println();
        }

    }

    public static void main(String args[]) {
        Sign sign2 = new Sign("ABCDE", 2);

        sign2.getLines();
        sign2.numberOfLines();


    }

    
}
