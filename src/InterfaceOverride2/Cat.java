package InterfaceOverride2;

public class Cat implements Animal{       //3

    @Override
    public void makeSound(){
        System.out.println("Miyav");
    }
}
