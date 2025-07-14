package module2.mvc.service;

import module2.mvc.entity.Teacher;
import module2.mvc.repo.ITeacherRepo;
import module2.mvc.repo.TeacherRepo;

import java.util.List;

public class TeacherService implements ITeacherService {
    private ITeacherRepo teacherRepo = new TeacherRepo();
    @Override
    public void addTeacher(Teacher teacher) {
        teacherRepo.add(teacher);
    }

    @Override
    public boolean removeTeacher(Teacher teacher) {
        return teacherRepo.remove(teacher);
    }

    @Override
    public List<Teacher> getTeachers() {
        return teacherRepo.getTeachers();
    }

    @Override
    public Teacher findTeacherByCode(String code) {
        for (Teacher teacher : teacherRepo.getTeachers()) {
            if (teacher.getCode().equals(code)) {
                return teacher;
            }
        }
        return null;
    }
}
