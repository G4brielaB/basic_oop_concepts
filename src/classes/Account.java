package classes;

public class Account implements Transaction{
    private int id;
    private double balance;
    private String local;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    @Override
    public void withdraw(double amountToWithdraw) {
        if(balance >= amountToWithdraw)
            this.balance -= amountToWithdraw;
    }

    @Override
    public void deposit(double amountToDeposit) {
        balance += amountToDeposit;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("id=").append(id);
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }
}
