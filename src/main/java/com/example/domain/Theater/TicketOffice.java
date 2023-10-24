package com.example.domain.Theater;

import lombok.Getter;

@Getter
public class TicketOffice {
    private Long amount;

    private Ticket tickets;

    public void plusAmount(Long fee) {
        this.amount += fee;
    }
}
