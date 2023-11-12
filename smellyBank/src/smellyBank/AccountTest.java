package smellyBank;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {

    private Account account;

    @Before
    public void setUp() {
        account = new Account("John Doe", 1000);
    }

    @Test
    public void testWithdraw() {
        account.withdraw(500);
        assertEquals("Balance should decrease by 500.", 500, account.balance, 0.01); 
        // Note: For JUnit4, the message comes first
    }
}
