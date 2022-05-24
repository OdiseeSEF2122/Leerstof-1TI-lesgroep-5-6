package oefBank;

import java.util.ArrayList;

/* Dit is nog de oude Bank met aggregatie */
public class Bank {

    private ArrayList<Account> accounts = new ArrayList<Account>();

    public double openAccount(){
        Account account = new Account();
        accounts.add(account);
        return account.getAccountNumber();
    }

    private Account findAccount(double rekeningnummer){
        for(Account account: accounts){
            if(account.getAccountNumber() == rekeningnummer){
                return account;
            }
        }
    }

    private int numAccounts(){
        return accounts.size();
    }

    public void closeAccount(double rekeningnummer){
        accounts.remove(findAccount(rekeningnummer));
    }

    public void withdraw(double rekeningnummer, double amount){
        //TODO eventueel extra checks of amount niet negatief is etc
        findAccount(rekeningnummer).withdraw(amount);
    }

    public void deposit(double rekeningnummer, double amount){
        //TODO eventueel extra checks of amount niet negatief is etc
        findAccount(rekeningnummer).deposit(amount);
    }


    public String toString() {
        String str=String.format("Bank managing %d accounts:\n",numAccounts());
        for (Account account : accounts) {
            str+=account.toString()+"\n";
        }
        return str;
    }

    public static void main(String[] args) {
        //Hoe een Bank met composition zou gebruikt kunnen worden
        Bank myBank=new Bank();
/*        myBank.openAccount();
        myBank.openAccount();
        myBank.openAccount();
        myBank.withdraw(1,20); //should print Cannot withdraw money that is not present
*/
        System.out.println(myBank.toString()); //should print 3 accounts with 0 balance
    }
}
