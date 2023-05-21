package Service;

import Model.Studint;
import Model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ShcoolService {


        private ArrayList<Studint> students = new ArrayList<>();


        private ArrayList<Teacher> teachers = new ArrayList<>();


        public ArrayList<Studint> getAllStudents() {
            return students;
        }


        public void addStudent(Studint student) {
            students.add(student);
        }


        public void updateStudent(String id, Studint student) {
            for (int i = 0; i < students.size(); i++) {
                Studint s = students.get(i);
                if (s.getId().equals(id)) {
                    students.set(i, student);
                    return;
                }
            }
        }


        public void deleteStudent(String id) {
            students.removeIf(s -> s.getId().equals(id));
        }


        public ArrayList<Teacher> getAllTeachers() {
            return teachers;
        }


        public void addTeacher(Teacher teacher) {
            teachers.add(teacher);
        }


        public void updateTeacher(String id, Teacher teacher) {
            for (int i = 0; i < teachers.size(); i++) {
                Teacher t = teachers.get(i);
                if (t.getId().equals(id)) {
                    teachers.set(i, teacher);
                    return;
                }
            }
        }


        public void deleteTeacher(String id) {
            teachers.removeIf(t -> t.getId().equals(id));
        }
    public Teacher getTeacherById(String id) {
        for (Teacher t : teachers) {
            if (t.getId().equals(id)) {
                return t;
            }
        }
        return null;
    }


    public Studint getStudentByName(String name) {
        for (Studint s : students) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }
}
