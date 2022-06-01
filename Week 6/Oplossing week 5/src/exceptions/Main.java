package exceptions;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOfFirstNNumbers(2)); // must be 3
        System.out.println(sumOfFirstNNumbers(5)); // 15
    }

    public static int sumOfFirstNNumbers(int n){
        // n * (n+1) / 2
        if(n> 0) {
            return sumOfFirstNNumbers(n - 1) + n;
        } else {
            return 0;
        }
    }
}
