package com.atm.model;
import java.util.Scanner;

public class Account {
    private String accountNumber;
    private String pin;
    private double balance;

    public Account(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    // Getter dan Setter
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public void debit(double amount) {
        this.balance -= amount;
    }

    // Method untuk mengubah PIN
    public void changePin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan PIN lama: ");
        String pinLama = scanner.nextLine();

        // Verifikasi PIN lama
        if (pinLama.equals(this.pin)) {
            System.out.print("Masukkan PIN baru: ");
            String pinBaru1 = scanner.nextLine();
            System.out.print("Masukkan PIN baru sekali lagi: ");
            String pinBaru2 = scanner.nextLine();

            // Validasi PIN baru
            if (pinBaru1.equals(pinBaru2)) {
                this.pin = pinBaru1;
                System.out.println("PIN berhasil diubah.");
            } else {
                System.out.println("PIN baru tidak cocok. Silakan coba lagi.");
            }
        } else {
            System.out.println("PIN lama salah.");
        }
    }
}
