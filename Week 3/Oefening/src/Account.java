public class Account {

    private int age;
    private String name;

    public Account(final int age, final String name){
        this.age = age;
        this.name = name;
    }
/*
    @Override
    public boolean equals(Object o){
        Account tmp = (Account) o;
        return ((tmp.age == this.age) && (tmp.name == this.name));
    }*/
}
