package org.AbhishekKumar.controller;

import org.GouthamPeddi.model.Department;
import org.GouthamPeddi.model.Student;
import org.GouthamPeddi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("students")
    public Iterable<Student> getAllStudents(){
        return  studentService.getAllStudents();
    }
    @GetMapping("students/student/{sId}")
    public Student getStudentById(@PathVariable Integer sId){
        return studentService.getStudentById(sId);
    }
    @PostMapping("student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @PutMapping("students/student/{sId}/department/{department}")
    public String updateStudentDepartment(@PathVariable Integer sId, @PathVariable Department department){
        return studentService.updateStudentDepartment(sId,department);
    }
    @DeleteMapping("students/student/{sId}")
    public String deleteStudent(@PathVariable Integer sId){
        return studentService.deleteStudent(sId);
    }

}