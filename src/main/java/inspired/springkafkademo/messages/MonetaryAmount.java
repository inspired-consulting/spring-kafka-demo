package inspired.springkafkademo.messages;

import java.math.BigDecimal;

public class MonetaryAmount {

    private BigDecimal amount;

    private Currency currency;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
