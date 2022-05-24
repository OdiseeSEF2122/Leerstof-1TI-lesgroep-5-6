package StaticPolymorfisme;

public class Addition {

    void sum (int a, int b){
        int result = a+b;
        System.out.println("Addition of two numbers:" + result);
    }

    void sum (int a, int b, int c){
        int result = a+b+c;
        System.out.println("Addition of three numbers:" + result);
    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.sum(10, 7);
        obj.sum(3,9,16);
    }
}
