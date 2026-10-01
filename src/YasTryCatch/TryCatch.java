package YasTryCatch;

public class TryCatch {          //2

    private String age;

    public TryCatch(String age){
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String yas) {
        this.age = yas;
    }


    public void parseInt(){

        try {
            int number = Integer.parseInt(getAge());
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Düzgün rəqəm daxil edin!");
        }

    }

}
