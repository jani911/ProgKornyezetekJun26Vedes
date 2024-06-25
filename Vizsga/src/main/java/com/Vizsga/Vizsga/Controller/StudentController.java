package com.Vizsga.Vizsga.Controller;

import com.Vizsga.Vizsga.Entity.Student;
import com.Vizsga.Vizsga.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student postDetails(@RequestBody Student student){

        return studentService.saveDetails(student);

    }

    @DeleteMapping("/deleteStudent/{id}")
    public String delete(@PathVariable int id){

        return studentService.deleteStudent(id);

    }


    @PutMapping("/updateStudent")
    public Student updateStudentDetails(@RequestBody Student student){

        return studentService.updateDetail(student);

    }




    @GetMapping("/getStudent")
    public List<Student> getDetails(){
        return studentService.getAllDetails();
    }
}
