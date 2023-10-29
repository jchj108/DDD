package com.example.domain.book;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }
}
