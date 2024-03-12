// class Vehicle{
//     String name;
//     Vehicle(String name){
//         this.name = name;
//     }

//     void bike(){
//         System.out.println("Royal Enfield \n Pulsar");
//     }
// }
// class car extends Vehicle{
//     car(St)
// }

class Vehicle{
    void bikeName(){
        System.out.println("Royal Enfield \n Pulsar \n \n \n");
    }
}

class Car extends Vehicle{
    void carName(){
        System.out.println("Mercedes \n Audi");
    }
}
public class singleLevelinheitance {
    public static void main(String[] args) {
        Car c = new Car();
        c.bikeName();
        c.carName();
    }
}