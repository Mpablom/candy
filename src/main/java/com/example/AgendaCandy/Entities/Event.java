package com.example.AgendaCandy.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "EVENT")
public class Event {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column(name = "EVENT_DATE")
    private LocalDate eventDate;
    @Column(name = "CLIENT_NAME")
    private String clientName;
    @Column(name ="LOCATION")
    private String location;
    @Column(name = "PHONE")
    private String phone;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
    private List<Item> items;
}
