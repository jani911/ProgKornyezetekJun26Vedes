package com.Vizsga.Vizsga.Repository;

import com.Vizsga.Vizsga.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
