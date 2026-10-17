package collections;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        // array
        String[] names = new String[3];
        names[0] = "Alex";
        names[1] = "bob";
        names[2] = "charlie";


        for (int count = 0; count < names.length; count++ ){
//            System.out.println(names[count]);
        }

        int i = 0;
        while (i < 0) {
//            System.out.println("hello!");
            System.out.println(i);
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int age = scanner.nextInt();

        try {
            if (age < 0) throw new IllegalArgumentException("Age is not valid!");
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
