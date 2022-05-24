package composition.oefCompositionBank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void whenWithdrawing_GivenNoMoneyPresent_resultsNoBalanceChange() {
        Bank myBank=new Bank();
        myBank.openAccount();
        double balance=myBank.getBalance(0);

        myBank.withdraw(0,20);
        assertEquals(balance,myBank.getBalance(0));
    }
}