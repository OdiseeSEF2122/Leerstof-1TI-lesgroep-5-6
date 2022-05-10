public class Main {

    public static void main(String[] args) {
	// write your code here

        final Account ac1 = new Account(35, "Draak");
        final Account ac2 = new Account(35, "Draak");
        final Account ac3 = new Account(666, "Draak");
        System.out.println(ac1.equals(ac2));
        System.out.println(ac1.equals(ac3));
        final Account ac4 = ac1;
        System.out.println(ac1==ac2);
        System.out.println(ac1==ac4);
    }
}
