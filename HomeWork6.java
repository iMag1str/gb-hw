/**
 * Java 1. HomeWork 6
 *
 * @author Mark
 * @version 27.10.2021
 */
class HomeWork6 {
    public static void main(String[] args) {
        System.out.println("Home work #6");
        System.out.println();
        Cat cat = new Cat(200, 0);
        Dog dog = new Dog(500, 10);
        Animal[] animals = {cat, dog};
        for (YAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(199));
            System.out.println(animal.swim(9));
            System.out.println(animal.run(201));
            System.out.println(animal.swim(11));
            System.out.println(animal.run(501));
            System.out.println();
        }
    }
}

class Cat extends Animal {
    Cat (int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }

    @Override
    public String swim(int distance) {
        return getClassName() + " - can't swim;";
    }
}

class Dog extends Animal {
    Dog (int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }
}

interface YAnimal {
    String run(int distance);
    String swim(int distance);
}

abstract class Animal implements YAnimal{
    protected String className;
    protected int runLimit;
    protected int swimLimit;

    Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return className + " - Running limit is " + runLimit + ", Swimming limit is " + swimLimit +";";
    }

    public String run(int distance) {
        if (distance > runLimit) {
            return className + " - can't run " + distance +";";
        } else {
            return className + " - ran " + distance +";";
        }
    }

    public String swim(int distance) {
        if (distance > swimLimit) {
            return className + " - can't swim " + distance +";";
        } else {
            return className + " - swam " + distance +";";
        }
    }
}