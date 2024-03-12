class Janwar{
    void eat(){
        System.out.println("Eating..");
    }
}
class WildDog extends Janwar{
    void bark(){
        System.out.println("Dog is barking..");
    }
}
class PetDog extends WildDog{
    void sleep(){
        System.out.println("Sleeping..");
    }
}
public class multilevelInheritance {
    public static void main(String[] args) {
        PetDog dog = new PetDog();

        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
