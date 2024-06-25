package com.Vizsga.Vizsga.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "student_db")
@NoArgsConstructor
@AllArgsConstructor
public class Student {

   @Id
   @Column(name = "ID")
   @GeneratedValue
    private int id;

   @Column(name = "Grade")
   private int grade;

   @Column(name ="Name")
   private String name;
}
