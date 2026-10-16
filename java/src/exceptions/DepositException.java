package exceptions;

import java.util.ArrayList;
import java.util.List;

public class DepositException {

    static String[] names = new String[1];

    static List<String> namesList = new ArrayList<>();

    public static void main(String[] args) {
        try {
            withdraw(200);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error Withdrawing!!!");
        }

        names[0] = "John";
        names[1] = "John";

        namesList.add("John");
        namesList.add("John");
        namesList.add("John");
        namesList.add("John");
        namesList.add("John");
    }

    public static void withdraw(int amount) throws InsufficientBalanceException {
        throw new InsufficientBalanceException("Not enough balance!");
    }
}
