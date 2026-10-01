package InterfaceOverride2;

public class Cow implements Animal{         //3

    @Override
    public void makeSound(){
        System.out.println("Möö");
    }
}
