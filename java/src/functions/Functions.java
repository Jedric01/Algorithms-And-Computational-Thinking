package functions;

import oop.Person;

public class Functions {

    public static void main(String[] args){

        Person person = new Person("adfadf", 2, 3, 4);

        int num1 = -2;
        int num2 = 12;

        int x = add(num1, num2);

//        System.out.println(x);
//
//        System.out.println("num1: " + num1);
//        System.out.println("num2: " + num2);
        printMenu();
        // ... 50 lines of code
        System.out.println("Doing something else");
        printMenu();
        // ... 50 lines of code
        System.out.println("Doing something else");
        printMenu();

    }

    static int add(int a, int b){
        a = a + b;
        return a;
    }

    public static void printMenu(){
        System.out.println("ATM Menu");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Update Profile");
        System.out.println("4. Process Cheque");
        System.out.println("5. Exit");
    }
}
