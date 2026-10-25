package oop;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private final List<Medium> mediums = new ArrayList<>();

    public void addMedium(Medium newMedium) {
        mediums.add(newMedium);
    }

    public void listInfo() {
        this.mediums.forEach(Medium::printInfo);
    }
}
