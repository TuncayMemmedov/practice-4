package InterfaceOverride2;

public class Dog implements Animal{        //3


    @Override
    public void makeSound() {
        System.out.println("Hav hav");
    }
}
