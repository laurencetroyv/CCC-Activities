package bankingAct.banking;
public class Account
{
    private double balance;
    public Account (double init_balance)
    {
        balance = init_balance;
    }
    public double getBalance()
    {
        return balance;
    }
    public double deposit(double amt)
    {
        balance += amt;
        return amt;
    }
    public double withdraw(double amt)
    {
        balance -= amt;
        return amt;
    }
}