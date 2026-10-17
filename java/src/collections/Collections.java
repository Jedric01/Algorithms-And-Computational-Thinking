package collections;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Alex");

        names.add("Bob");

        names.forEach(System.out::println);

        names.add(1, "Charlie");
        names.remove("Charlie");
        names.forEach(System.out::println);

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alex", 30);
        scores.put("Bob", 50);
        scores.put("Charlie", 90);



        List<Integer> scoresList = new ArrayList<>();


        for (Integer score: scores.values()) {
            System.out.println(score);
            scoresList.add(score);
        }

        System.out.println("printing out scoresList");
        scoresList.forEach(System.out::println);


    }
}
