package id.ac.polinema;

public class Savingsaccount extends Account {
    private double interestRate;

    public Savingsaccount(String accountNumber, Customer owner, double balance, double interestRate) {
        super(accountNumber, owner, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void printAccountType() {
        System.out.println("Account type: Savings, interest rate: " + interestRate);
    }
}
