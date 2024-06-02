package com.cuenta.appcuenta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author Usuario
 */
@Data
@Entity()
@Table(name="cuenta")
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "BINARY(16)")
    private String id;
    private double credit;
    private double rate;
    private int time;
    private double balance;
    private double amortization;
    private double interestAmount;
    private double fee;
}
