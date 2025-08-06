package module2.mvc.controller;

import module2.mvc.entity.Teacher;
import module2.mvc.service.ITeacherService;
import module2.mvc.service.TeacherService;

import java.util.List;

public class TeacherController {
    private ITeacherService teacherService = new TeacherService();

    public void addTeacher(Teacher teacher) {
        teacherService.addTeacher(teacher);
    }
    public boolean removeTeacher(Teacher teacher) {
        return teacherService.removeTeacher(teacher);
    }
    public List<Teacher> getTeachers() {
        return teacherService.getTeachers();
    }
    public Teacher getTeacherByCode(String code) {
        return teacherService.findTeacherByCode(code);
    }
}
