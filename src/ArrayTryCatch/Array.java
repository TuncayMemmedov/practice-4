package ArrayTryCatch;

public class Array {         //4

    int[] numbers = {10, 20, 30, 40, 50};

    String index;

    public Array(String index){
        this.index = index;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void index(){

        int number = Integer.parseInt(getIndex());
        System.out.println(numbers[number]);
    }

    public void test(){

        try {
            index();
        }catch (NumberFormatException e){
            System.out.println("Yanlis");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Yanlış index!");
        }
    }

}
