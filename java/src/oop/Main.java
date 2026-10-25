package oop;

public class Main {

    public static void main(String[] args) {

        Medium b1 = new Book("HP", "JK");
        Medium v1 = new Vinyl("vinly1", "artist-a", 30);

        Catalog c = new Catalog();
        c.addMedium(b1);
        c.addMedium(v1);
        c.listInfo();



    }

    public static void doSomething(Medium m){
        m.printInfo();
    }

//    public static void doSomething(Vinyl v){
//        v.printInfo();
//    }
}
