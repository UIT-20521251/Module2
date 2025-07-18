package module2.mvc.controller;

import module2.mvc.entity.Student;
import module2.mvc.service.IStudentService;
import module2.mvc.service.StudentService;

import java.util.List;

public class StudentController {
    private IStudentService studentService= new StudentService();

    public void addStudent(Student student) {
        studentService.addStudent(student);
    }
    public boolean removeStudent(Student student) {
        return studentService.removeStudent(student);
    }
    public Student getStudentByCode(String code) {
        return studentService.findStudentByCode(code);
    }
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
