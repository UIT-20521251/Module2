package module2.mvc.repo;

import module2.mvc.entity.Student;

import java.util.List;

public interface IStudentRepo {
    void add(Student student);
    boolean delete(Student student);
    List<Student> getStudents();
}
