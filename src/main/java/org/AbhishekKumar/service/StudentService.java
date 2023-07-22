package org.GouthamPeddi.service;

import org.GouthamPeddi.model.Department;
import org.GouthamPeddi.model.Student;
import org.GouthamPeddi.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;

    public Iterable<Student> getAllStudents() {
        return  studentRepo.findAll();
    }

    public Student getStudentById(Integer sId) {
        return studentRepo.findByStudentId(sId);
    }

    public String addStudent(Student student) {
        studentRepo.save(student);
        return "student" + " " + student.getStudentId() + " "+ "added successfully";
    }

    public String updateStudentDepartment(Integer sId, Department department) {
        Optional<Student> myStudentOpt = studentRepo.findById(sId);
        Student myStudent = null;
        if(myStudentOpt.isPresent()){
            myStudent = myStudentOpt.get();
        }else{
            return "Id not found!!!";
        }
        myStudent.setStudentDepartment(department);
        studentRepo.save(myStudent);
        return "Student department Updated to "+" : "+ department;
    }

    public String deleteStudent(Integer sId) {
        if(studentRepo.existsById(sId)) {
            studentRepo.deleteById(sId);
            return "Student successfully deleted" + " : " + sId;
        }
        return "no such student exist!!!";
    }
}
