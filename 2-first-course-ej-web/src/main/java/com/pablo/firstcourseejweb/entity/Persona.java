package com.pablo.firstcourseejweb.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="TablaPersonas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    @Id
    private Long id;
    private String nombre;
    private int edad;

}
