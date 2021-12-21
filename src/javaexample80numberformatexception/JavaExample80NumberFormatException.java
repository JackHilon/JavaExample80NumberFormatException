package javaexample80numberformatexception;

import java.util.Scanner;

public class JavaExample80NumberFormatException {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        while (true) {

            try {
                String str = input.nextLine();

                System.out.print("Your number is: ");
                int i = Integer.parseInt(str);
                System.out.println(i);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("This is not a number!!!!");
            }
        }

    }

}
