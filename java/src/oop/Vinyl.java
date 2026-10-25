package oop;

public class Vinyl extends Medium {
    private final String artist;
    private final int duration;

    public Vinyl(String title, String artist, int duration) {
        super(title);
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("This medium is a Vinyl! Artist: " + artist);
    }
}
