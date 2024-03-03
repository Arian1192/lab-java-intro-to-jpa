package com.ironhacklab.intro_jpa.Model;

import com.ironhacklab.intro_jpa.Enums.CustomerStatus;
import jakarta.persistence.*;

import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID CustomerId;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "customer_status")
    private CustomerStatus CustomerStatus;
    @Column(name="total_customer_mileage")
    private int totalCustomerMileage;
}
