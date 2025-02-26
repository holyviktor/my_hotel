package com.example.my_hotel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Client {
    @Id
    @Size(max=10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String IPN;

    @NotNull
    @Size(max = 20)
    private String surname;

    @NotNull
    @Size(max = 20)
    private String name;

    @NotNull
    @Size(max = 20)
    private String patronymic;

    @NotNull
    @Size(max=13)
    private String phone_number;

    @NotNull
    @Size(max=30)
    private String email;
    @NotNull
    private int  bonus_card;

    @ManyToOne
    @JoinColumn(name ="id_response")
    private Response id_response ;

}