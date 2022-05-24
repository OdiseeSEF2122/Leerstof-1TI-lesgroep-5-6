package polymorphism.overloading;

public class MyNumber {
    private static String format(int value) {
        return String.format("%d", value);
    }
    private static String format(double value) {
        return String.format("%.3f", value);
    }
    public static void main(String[] args) {
        System.out.println(format(20));
        System.out.println(format(1.2345));
        System.out.println(format((float)15.455554));
    }
}
