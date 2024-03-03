package com.ironhacklab.intro_jpa.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name="FlightBooking")
public class FlightBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;
    @Column(name="customer_id")
    private int customerId;
    @Column(name="flight_id")
    private int flightId;

    @ManyToOne
    @JoinColumn(name="customer_id", referencedColumnName = "customer_id",insertable = false, updatable = false)
    private Customer customer;
    @ManyToOne
    @JoinColumn(name="flight_id", referencedColumnName = "flight_id",insertable = false, updatable = false)
    private Flight flight;
}
