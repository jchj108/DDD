package com.example.domain.book;

import java.math.BigDecimal;

public class Money {
    private static final Money ZERO = Money.wons(0);

    private final BigDecimal amount;

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public static Money wons(double amount) {
        return new Money(BigDecimal.valueOf(amount));
    }
}
