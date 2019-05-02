package Controller;

import model.*;

import java.util.Arrays;

public class Zoo {

    public Lion[] getLions() {
        return lions;
    }

    public Cow[] getCows() {
        return cows;
    }

    public Turtle[] getTurtles() {
        return turtles;
    }

    public Tiger[] getTigers() {
        return tigers;
    }

    public Snake[] getSnakes() {
        return snakes;
    }

    private Lion[] lions = new Lion[0];
    private Cow[] cows = new Cow[0];
    private Turtle[] turtles = new Turtle[0];
    private Tiger[] tigers = new Tiger[0];
    private Snake[] snakes = new Snake[0];

    public Animal[] expandArray(Animal[] animals, Animal animal){
        animals = Arrays.copyOf(animals, animals.length+1);
        animals[animals.length-1]=animal;
        return animals;
    }

    public void addAnimal(Animal animal){
        if(animal.getName() != null){
            if(animal instanceof Lion) {
                lions = (Lion[]) expandArray(lions, animal);
            }else if (animal instanceof Cow){
                cows = (Cow[])expandArray(cows,animal);

            }else if (animal instanceof Tiger){
                tigers = (Tiger[])expandArray(tigers,animal);

            }else if (animal instanceof Snake){
                snakes = (Snake[])expandArray(snakes, animal);

            }else if (animal instanceof Turtle) {
                turtles = (Turtle[]) expandArray(turtles, animal);

            }
        }
    }

    public void printAnimals(Animal[] animals){
        for (Animal animal : animals){
            System.out.println(animal);
            animal.makeNoise();
            animal.move();
        }
        System.out.println("-".repeat(45));

    }




}
