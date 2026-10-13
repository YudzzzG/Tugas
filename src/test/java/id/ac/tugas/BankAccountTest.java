package id.ac.tugas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    @Test
    void saldoAwalNol() {
        BankAccount account = new BankAccount();
        assertEquals(0.0, account.getBalance(), 0.001);
    }

    @Test
    void depositMenambahSaldo() {
        BankAccount account = new BankAccount();
        account.deposit(100_000);
        assertEquals(100_000, account.getBalance(), 0.001);
    }

    @Test
    void depositNolTidakMengubahSaldo() {
        BankAccount account = new BankAccount();
        account.deposit(0);
        assertEquals(0.0, account.getBalance(), 0.001);
    }

    @Test
    void depositNegatifDitolak() {
        BankAccount account = new BankAccount();
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-1));
    }

    @Test
    void withdrawMengurangiSaldo() {
        BankAccount account = new BankAccount();
        account.deposit(100_000);
        account.withdraw(30_000);
        assertEquals(70_000, account.getBalance(), 0.001);
    }

    @Test
    void withdrawMelebihiSaldoDitolak() {
        BankAccount account = new BankAccount();
        account.deposit(20_000);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(25_000));
        assertEquals(20_000, account.getBalance(), 0.001);
    }

    @Test
    void withdrawNegatifDitolak() {
        BankAccount account = new BankAccount();
        account.deposit(20_000);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-5_000));
    }

    @Test
    void getBalanceMengembalikanSaldoTerbaru() {
        BankAccount account = new BankAccount();
        account.deposit(50_000);
        account.withdraw(10_000);
        assertEquals(40_000, account.getBalance(), 0.001);
    }
}
