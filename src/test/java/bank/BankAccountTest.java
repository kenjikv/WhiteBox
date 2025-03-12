package bank;

import static org.junit.jupiter.api.Assertions.*;

import org.example.bank.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount("12345", "Juan Pérez", 1000.0);
    }

    @Test
    void testDeposit() {
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    void testDepositNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.deposit(-100));
        assertEquals("El monto a depositar debe ser mayor a cero.", exception.getMessage());
    }

    @Test
    void testWithdraw() {
        account.withdraw(200);
        assertEquals(800, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(2000));
        assertEquals("Fondos insuficientes.", exception.getMessage());
    }

    @Test
    void testTransfer() {
        BankAccount targetAccount = new BankAccount("67890", "María López", 500);
        account.transfer(targetAccount, 300);
        assertEquals(700, account.getBalance());
        assertEquals(800, targetAccount.getBalance());
    }

    @Test
    void testTransferInvalidTarget() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.transfer(null, 100));
        assertEquals("La cuenta de destino no puede ser nula.", exception.getMessage());
    }

}

