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

    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount)
    }

    private Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }
}
