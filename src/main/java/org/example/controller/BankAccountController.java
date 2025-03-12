package org.example.controller;

import org.example.bank.BankAccount;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/bank")
public class BankAccountController {
    private Map<String, BankAccount> accounts = new HashMap<>();

    @PostMapping("/create")
    public ResponseEntity<String> createAccount(@RequestParam String accountNumber,
                                                @RequestParam String owner,
                                                @RequestParam double initialBalance) {
        accounts.put(accountNumber, new BankAccount(accountNumber, owner, initialBalance));
        return ResponseEntity.ok("Cuenta creada exitosamente.");
    }

    @PostMapping("/deposit")
    public ResponseEntity<String> deposit(@RequestParam String accountNumber,
                                          @RequestParam double amount) {
        BankAccount account = accounts.get(accountNumber);
        if (account == null) {
            return ResponseEntity.badRequest().body("Cuenta no encontrada.");
        }
        account.deposit(amount);
        return ResponseEntity.ok("Depósito realizado.");
    }

    @PostMapping("/withdraw")
    public ResponseEntity<String> withdraw(@RequestParam String accountNumber,
                                           @RequestParam double amount) {
        BankAccount account = accounts.get(accountNumber);
        if (account == null) {
            return ResponseEntity.badRequest().body("Cuenta no encontrada.");
        }
        try {
            account.withdraw(amount);
            return ResponseEntity.ok("Retiro realizado.");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/transfer")
    public ResponseEntity<String> transfer(@RequestParam String fromAccount,
                                           @RequestParam String toAccount,
                                           @RequestParam double amount) {
        BankAccount sender = accounts.get(fromAccount);
        BankAccount receiver = accounts.get(toAccount);
        if (sender == null || receiver == null) {
            return ResponseEntity.badRequest().body("Una o ambas cuentas no existen.");
        }
        try {
            sender.transfer(receiver, amount);
            return ResponseEntity.ok("Transferencia realizada.");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/balance")
    public ResponseEntity<Double> getBalance(@RequestParam String accountNumber) {
        BankAccount account = accounts.get(accountNumber);
        return account != null ? ResponseEntity.ok(account.getBalance()) : ResponseEntity.notFound().build();
    }
}
