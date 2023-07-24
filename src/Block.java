import java.util.Date;

public class Block {
    public static void main(String[] args) { // Block 1

        int value; // Expression
        value = 10; // Expression

        System.out.println(value = 100); // Expression didalam Statement

        // assignment statement
        double aValue = 8933.234;
        // increment statement
        aValue++;
        // method invocation statement
        System.out.println("Hello World!");
        // object creation statement
        Date date = new Date();

        System.out.println("Hello World 1"); // Statement
        System.out.println("Hello World 2"); // Statement
        System.out.println("Hello World 3"); // Statement

        { // Block 2
            System.out.println("Hello World 4"); // Statement
            System.out.println("Hello World 5"); // Statement
            System.out.println("Hello World 6"); // Statement
        }

    }
}
