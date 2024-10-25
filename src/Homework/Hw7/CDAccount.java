package Homework.Hw7;

import java.time.LocalDate;
import java.time.Period;

public class CDAccount extends BankAccount{

    protected LocalDate startDate;
    protected Period term;

    CDAccount(String accountNumber, MonetaryValue balance, LocalDate startDate,Period term ){
        super(accountNumber, balance);
        this.startDate=startDate;
        this.term=term;
    }

    public LocalDate getTermEnd(){
        return startDate.plus(term);
    }

    @Override
    protected boolean withdrawalNotAllowed(MonetaryValue amount) {
        LocalDate end = this.startDate.plus(term);
       return super.withdrawalNotAllowed(amount) || LocalDate.now().isBefore(end);

    }

}
