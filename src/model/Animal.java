package model;

public abstract class Animal {
    private int weight;
    private int age;
    private String name;
    private String gender;


    public Animal() {
    }

    public Animal(int weight, int age, String name, String gender) {
        this.weight = weight;
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public abstract void move();


    public abstract void makeNoise();


    @Override
    public String toString() {
        return String.format("%s:%n\t-Name:%s%n\t-Weight:%dKg%n\t-Gender:%s%n\t-Age:%d%n", getClass().getSimpleName(), name, weight, gender, age);
    }
}
