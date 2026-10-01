package InterfaceOverride2;

public class Main {
    public static void main(String[] args){         //3

        Animal animal = new Dog();
        Animal animal1 = new Cat();
        Animal animal2 = new Cow();


        animal.makeSound();
        animal1.makeSound();
        animal2.makeSound();
    }
}
