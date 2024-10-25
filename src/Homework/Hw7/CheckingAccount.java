package Homework.Hw7;

public class CheckingAccount extends BankAccount{

    protected MonetaryValue overdraftLimit;

    public CheckingAccount(String accountNumber,MonetaryValue balance, MonetaryValue overdraftLimit ){
        super(accountNumber,balance);
        this.overdraftLimit=overdraftLimit;
    }

    public String getOverdraftLimit() {
        return this.overdraftLimit.toString();
    }
    @Override
    protected boolean withdrawalNotAllowed(MonetaryValue amount) {
        return amount.isNegative() || getBalance().toDouble() - amount.toDouble() < -overdraftLimit.toDouble();
    }

}

