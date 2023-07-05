package com.saurav.Hotel.Management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Room")
public class HotelRoom {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer roomId;
    @Column(unique = true)
    private Integer roomNum;
    @Enumerated(EnumType.STRING)
    private Type roomType;
    private Double roomPrice;
    @Column(name = "Status")
    private Boolean roomStatus;
}
