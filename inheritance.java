class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating...");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " is barking");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void meow() {
        System.out.println(name + " is meowing");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Dog d = new Dog("Nax");
        Cat c = new Cat("kitten");

        d.eat();
        d.sleep();
        d.bark();

        c.sleep();
        c.meow();
        //Hierarchical Inheritance Example


    }
}
