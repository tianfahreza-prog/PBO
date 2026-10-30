package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        // --- Langkah 1: Pengujian withdraw ---
        Customer customer = new Customer("Rian", "0812-0000-0003");
        SavingsAccount savings = new SavingsAccount("A003", customer, 100000, 0.02);

        try {
            savings.withdraw(70000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }

        try {
            savings.withdraw(30000);
            System.out.println("Withdrawal succeeded, new balance: " + savings.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }

        // --- Langkah 2: Setup Bank & processMonthEnd ---
        Customer c1 = new Customer("Nadia", "0812-0000-0001");
        Customer c2 = new Customer("Sari", "0812-0000-0002");

        SavingsAccount acc1 = new SavingsAccount("A001", c1, 500000, 0.01);
        CheckingAccount acc2 = new CheckingAccount("A002", c2, 200000, 50000);

        Bank bank = new Bank(10);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(savings);
        bank.processMonthEnd();

        bank.printAuditLog();

        try {
            Account found = bank.findAccount("A001");
            System.out.println("Found: " + found.getAccountNumber());
        } catch (AccountNotFoundException e) {
            System.out.println("Search failed: " + e.getMessage());
        }

        try {
            Account notFound = bank.findAccount("A999");
            System.out.println("Found: " + notFound.getAccountNumber());
        } catch (AccountNotFoundException e) {
            System.out.println("Search failed: " + e.getMessage());
        }
    }
}