package oop;

public class Person {

    // attributes
    String name;
    public int height;
    protected int age;

    public Phone smartphone;

    public int x;

    // constructor
    public Person(String name, int height, int age, int weight) {

        this.name = name;
        this.height = height;

        if(isValidAge(age))
            this.age = age;
        else
            throw new IllegalArgumentException("Age is not valid!");

    }

    public Person() {
        this.name = "John Doe";
        this.height = 180;
        this.age=28;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int newAge) {
        if(isValidAge(newAge))
            this.age = newAge;
        else
            throw new IllegalArgumentException("Age is not valid!");
    }

    private boolean isValidAge(int age) {
        return age > 0;
    }

    public void exercise(String time) {
        System.out.println(this.name + " is exercising at " + time);
    }

    public String toString(){
        return this.name + " " + this.age;
    }

}
