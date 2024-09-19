package edu.icet.crm.repository.student;

import edu.icet.crm.dao.student.StudentDAO;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentDAO,Long> {
}
