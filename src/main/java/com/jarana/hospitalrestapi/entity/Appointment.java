/* package com.jarana.hospitalrestapi.entity;

import java.sql.Time;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date appointmentDate;
    private Time appointmentTime;
    private String status;

    //@JsonBackReference
    
    @ManyToOne    
    @JsonIgnoreProperties("appointment")
    @JoinColumn(name = "patient_id")    
    private Patient patient;

    //@JsonBackReference
    @ManyToOne
    @JsonIgnoreProperties("appointment")
    @JoinColumn(name = "doctor_id")    
    private Doctor doctor;

    // Getters and Setters
    
}
 */