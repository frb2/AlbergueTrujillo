package com.adopcion.app.domain.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="mascotas")
@Getter
@Setter
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="idMascota")
    private Integer id;

    @Column(name="name")
    private String nombre;

    @Column(name="race")
    private String raza;

    @Column(name="birthDate")
    private Date fechaNacimiento;

    @Column(name="size")
    private String tamaño;

    @Column(name="weight")
    private Double peso;

    @Column(name="type")
    private String tipoAnimal;

    @Column(name="health")
    private String salud;



}

