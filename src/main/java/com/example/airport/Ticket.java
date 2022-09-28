package com.example.airport;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinColumn(name = "passenger_id")
    private List<Passenger> passenger = new ArrayList<>();

    public Ticket() {
    }

    public Ticket(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Passenger> getPassenger() {
        return Collections.unmodifiableList(passenger);
    }

    public void addPassenger(Passenger passenger) {
        this.passenger.add(passenger);
    }

}
