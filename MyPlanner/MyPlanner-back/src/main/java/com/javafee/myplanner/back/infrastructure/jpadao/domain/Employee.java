package com.javafee.myplanner.back.infrastructure.jpadao.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@SequenceGenerator(name = "seq_employee", sequenceName = "seq_employee", initialValue = 14, allocationSize = 1)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_employee")
    private int id;
    private String name;
    private String surname;
    private int salary;
    @Column(name = "is_active")
    private boolean isActive;
    // company
}
