interface Sound {
    void makeSound();
}

class Kutta implements Sound {
    public void makeSound(){
        System.out.println("Kutta bhok rha hai..");
    }
}
class Billi implements Sound{
    public void makeSound(){
        System.out.println("Billi meow meow kar rahi hai..");
    }
}
public class interfaceEx {
    public static void main(String[] args) {
        Kutta dog = new Kutta();
        Billi cat = new Billi();
        
        dog.makeSound();
        cat.makeSound();
    }
}