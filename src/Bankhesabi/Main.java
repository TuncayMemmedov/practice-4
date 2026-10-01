package Bankhesabi;

public class Main {
    public static void main(String[] args){        //6

        BankAccount bankAccount = new BankAccount(800);

        try {
            bankAccount.withdraw(100);
        }catch (IllegalArgumentException e){
            System.out.println("Duzgun mebleg daxil edin");
        }catch (IllegalStateException e){
            System.out.println("Cixarilan pul balansdan coxdur");
        }
    }
}
