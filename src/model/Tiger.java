package model;

public class Tiger extends Animal {

    public Tiger() {
    }

    public Tiger(String name, int weight,String gender, int age) {
        super(weight, age, name, gender);
    }

    @Override
    public void move() {
        System.out.println("test");

    }

    @Override
    public void makeNoise() {
        System.out.println("test");

    }
}
