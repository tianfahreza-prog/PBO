package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Nadia", "0812-0000-0001");
        Account acc1 = new Account("A001", customer1, 500000);
        Account acc2 = new Account("A002", customer1, 350000);

        Customer customer2 = new Customer("Sari", "0812-0000-0002");
        Account acc3 = new Account("A003", customer2, 200000);

        Bank bank = new Bank(10);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);

        Account[] foundAccounts = bank.findAccountByOwnerName("Nadia");

        if (foundAccounts != null) {
            int totalDitemukan = 0;
            for (Account acc : foundAccounts) {
                if (acc != null) {
                    totalDitemukan++;
                }
            }

            System.out.println("Jumlah akun ditemukan: " + totalDitemukan);

            for (Account acc : foundAccounts) {
                if (acc != null) {
                    acc.printInfo();
                }
            }
        } else {
            System.out.println("Tidak ada akun ditemukan untuk pemilik tersebut.");
        }
    }
}