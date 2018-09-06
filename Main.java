public class Main {

    public static void main(String[] args) {
        /* String Formatting */

        // Display a decimal number
        System.out.println(2.3f);
        System.out.printf("%.2f",2.3f);
        System.out.println();
        System.out.printf("%.4f",2.3f);
        System.out.println();

        // Display a thousands separator
        System.out.println(1000000);
        System.out.printf("%,d",1000000);
        System.out.println();

        // Display a price
        System.out.println(1000.2f);
        System.out.printf("$%.2f", 1000.2f);
        System.out.println();
        System.out.printf("$%,.2f", 1000.2f);
        System.out.println();

        // Display a string
        System.out.println("Hello!");
        System.out.printf("|%20s|", "Hello!");
        System.out.println();
        System.out.printf("|%-20s|", "Hello!");
        System.out.println();
        System.out.printf("|%-20s|", "Hello, this is a long sentence.!");
        System.out.println();
        System.out.printf("|%-20.20s|", "Hello, this is a long sentence.!");
        System.out.println();

        // Display multiple items in a single string
        System.out.printf("%10s $%.2f\n","Apples",1.4f);
        System.out.printf("%10s $%.2f\n","Brownies",0.8f);
    }
}