package com.pruebalogin.ec.model.entity;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name="Usuario")

public class Usuario  implements  Serializable {


    @Id
    @Column(name = "IdUsuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdUsuario;
    @Column(name = "Username")
    private String Username;
    @Column(name = "Password")
    private String Password;
    @Column(name = "mail")
    private String mail;
    @Column(name = "SessioActivate")
    private String SessionActivate;
    @Column(name = "Personas_IdPersonas2")
    private Integer Persona_IdPersonas2;
    @Column(name = "Status")
    private String Status;




}
