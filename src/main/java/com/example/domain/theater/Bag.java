package com.example.domain.theater;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
public class Bag {
    private Long amount;
    private Invitation invitation;
    @Setter
    private Ticket ticket;
    public boolean hasInvitation() {
        return !Objects.isNull(invitation);
    }

    public void minusAmount(Long fee) {
        this.amount -= fee;
    }

    public void plusAmount(Long fee) {
        this.amount += fee;
    }
}
