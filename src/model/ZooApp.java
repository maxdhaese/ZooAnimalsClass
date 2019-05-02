package model;

import Controller.Zoo;

public class ZooApp {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        for (int i = 0; i < 4; i++) {
            zoo.addAnimal(new Snake("snake",18,"m",i));
            zoo.addAnimal(new Cow("cow",18,"m",i));
            zoo.addAnimal(new Turtle("turtle",18,"m",i));
            zoo.addAnimal(new Tiger("tiger",18,"m",i));
            zoo.addAnimal(new Lion("lion",18,"m",i));



        }
        zoo.printAnimals(zoo.getSnakes());
        zoo.printAnimals(zoo.getTigers());
        zoo.printAnimals(zoo.getTurtles());
        zoo.printAnimals(zoo.getCows());
        zoo.printAnimals(zoo.getLions());

    }
}
