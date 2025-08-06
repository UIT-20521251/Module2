package module2.mvc.service;

import module2.mvc.entity.Student;

import java.util.List;

public interface IStudentService {
    void addStudent(Student student);
    boolean removeStudent(Student student);
    List<Student> getStudents();
    Student findStudentByCode(String code);
}
