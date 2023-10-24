package com.example.domain;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;
    public boolean hasInvitation() {
        return !Objects.isNull(invitation);
    }
}
