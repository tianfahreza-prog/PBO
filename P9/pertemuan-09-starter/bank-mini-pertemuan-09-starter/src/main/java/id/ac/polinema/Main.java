package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Nadia", "0812-0000-0001");
        SavingsAccount acc1 = new SavingsAccount("A001", customer1, (double)500000.0F, 0.01);
        acc1.withdraw((double)150000.0F);

        Customer customer2 = new Customer("Sari", "0812-0000-0002");
        CheckingAccount acc2 = new CheckingAccount("A002", customer2, (double)200000.0F, (double)50000.0F);

        Customer customer3 = new Customer("Rian", "0812-0000-0003");
        SavingsAccount savings = new SavingsAccount("A003", customer3, (double)100000.0F, 0.02);
        savings.withdraw((double)70000.0F);

        Customer customer4 = new Customer("Dewi", "0812-0000-0004");
        CheckingAccount checking = new CheckingAccount("A004", customer4, (double)100000.0F, (double)200000.0F);
        checking.withdraw((double)250000.0F);

        System.out.println("Before Interest: " + savings.getBalance());
        savings.applyInterest();
        System.out.println("After Interest: " + savings.getBalance());

        Bank bank = new Bank(10);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(savings);
        bank.addAccount(checking);

        bank.printAllAccounts();
        bank.printMonthlyFees();

        System.out.println(acc2.auditLog());
        System.out.println(checking.auditLog());
    }
}