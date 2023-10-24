package com.example.domain;

import lombok.Getter;

import java.util.List;

@Getter
public class TicketOffice {
    private Long amount;

    private List<Ticket> tickets;

}
