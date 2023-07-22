package org.AbhishekKumar.repository;

import org.GouthamPeddi.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends CrudRepository<Student,Integer> {
    //  @Query(value = "select * from Student where student_id = :id" , nativeQuery = true)
    Student findByStudentId(Integer sId);
}
