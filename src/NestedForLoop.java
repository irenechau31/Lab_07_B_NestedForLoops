import java.util.Scanner;
public class NestedForLoop {
    public static void main(String[] args) {
        //A nested loop that creates this figure (there are no blank lines)
        //*
        //**
        //***
        //****
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println(); // to create the rectangle pattern, not all * in one line
        }
        System.out.println("----------------");

        //A nested loop that creates this figure (there are no blank lines)
        //*****
        //****
        //***
        //**
        //*
        for (int row = 1; row <= 5; row++) {
            for (int col = 5; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println(); // to create the rectangle pattern, not all * in one line
        }
        System.out.println("----------------");

        //A nested loop that creates this figure (there are no blank lines)
        //*****
        //*****
        //*****
        //*****
        //*****
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------");

        //C to F converter program
        Scanner in = new Scanner(System.in);
        double Celsius = 0.0;
        double Fahrenheit = 0.0;
        String trash = ""; // use for bad input (string instead of double)
        boolean done = false;
        do {
            System.out.println("Enter the temperature in Celsius: ");
            if (in.hasNextDouble()) {
                Celsius = in.nextDouble();// Ok to read in double
                in.nextLine();//clear the newline from the buffer
                done = true; // we got a valid Celsius input, we end the loop
            } else {
                trash = in.nextLine();
                System.out.println("Please enter a valid temperature in Celsius!");
            }
        }
        while (!done);//  !done is not false, which is true, we loop until is set to True by the test above
        Fahrenheit = (Celsius * 9 / 5) + 32;
        System.out.println("Equivalent temperature in Fahrenheit is: " + Fahrenheit);
        System.out.println("----------------");

        //Outputs an elaborate capital version of your first initial (I in Irene) using * characters
        // The first loop would do the first 3 lines and a second would do the rest.

        for (int row = 1; row <= 9; row++) {
            for (int column = 1; column <= 11; column++) {
                if (column >= 11 / 2 && column <= 11 /2+2 || row == 1|| row == 2|| row == 8||row == 9) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}