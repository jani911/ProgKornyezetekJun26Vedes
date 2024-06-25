package com.Vizsga.Vizsga.Service;

import com.Vizsga.Vizsga.Entity.Student;
import com.Vizsga.Vizsga.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student saveDetails(Student student){
        return studentRepo.save(student);
    }


    public String deleteStudent(int id){

        studentRepo.deleteById(id);
        return "felhasznalo torolve az alabbi ID-val: " +id;

    }

    public List<Student> getAllDetails(){
        return studentRepo.findAll();
    }

    public Student updateDetail(Student student){
        Student updateStudent=studentRepo.findById(student.getId()).orElse(null);
            if(updateStudent !=null){
                updateStudent.setGrade(student.getGrade());
                updateStudent.setName(student.getName());
                studentRepo.save(updateStudent);
                return updateStudent;

            }
 return null;

    }








}
