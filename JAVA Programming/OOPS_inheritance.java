public class OOPS_inheritance{
    public static void main (String args[]){
        // Fish shark = new Fish();
        // shark.eat();

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);

    }
}

//Base class  (Parent)
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

// Derived Class (Child)
// class Fish extends Animal{  //Animal>Fish Single level
//     int fins;

//     void swim(){
//         System.out.println("Swims Faster");
//     }
// }

class Mammal extends Animal{  
    int legs;
}

class Dog extends Mammal{  //Animal>Mammal>Dog Multi level
    String breathe;
}

