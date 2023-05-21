package Controller;

import Model.Studint;
import Model.Teacher;
import Service.ShcoolService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RequiredArgsConstructor
@RestControllerAdvice
@RestController
@RequestMapping("/api/v1/lombok")
public class SchoolController {

    @Autowired
    public SchoolController schoolService;


    @GetMapping("/get")
    public ArrayList<ShcoolService> getAllStudents() {


        ArrayList<ShcoolService> students = schoolService.getAllStudents();



        return new ResponseEntity<>(students, HttpStatusCode.valueOf().OK);
    }









    @PostMapping("/add")
    public ResponseEntity<Void> addStudent(@Valid @RequestBody Studint student) {
        schoolService.addStudent(student);

        return new ResponseEntity<>(HttpStatusCode.CREATED);
    }















    @PutMapping("/students/{id}")
    public ResponseEntity<Void> updateStudent(@PathVariable String id, @Valid @RequestBody Student student) {
        schoolService.updateStudent(id, student);
        return new ResponseEntity<>(HttpStatus.OK);
    }









    @DeleteMapping("/students/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable String id) {
        schoolService.deleteStudent(id);




        return new ResponseEntity<>(HttpStatusCode.OK);
    }


    @GetMapping("/teacher/get")
    public ResponseEntity<ArrayList<Teacher>> getAllTeachers() {


        ArrayList<Teacher> teachers = schoolService.getAllTeachers();


       return new ResponseEntity<>(teachers, HttpStatusCode.OK);
    }

    @PostMapping("/teacher/add")
    public ResponseEntity<Void> addStudent(@Valid @RequestBody Teacher teacher) {
        schoolService.addStudent(teacher);

        return new ResponseEntity<>(Httpteacher.CREATED);
    }

    @PutMapping("/teacher/{id}")
    public ResponseEntity<Void> updateStudent(@PathVariable String id, @Valid @RequestBody Teacher teacher) {
        schoolService.updateStudent(id, teacher);
        return new ResponseEntity<>(HttpStatusCode.OK);
    }


    @DeleteMapping("/teacher/{id}")
    public ResponseEntity<Void> deleteTeacher(@PathVariable Teacher id) {
        schoolService.deleteTeacher(id);




        return new ResponseEntity<>(HttpStatusCode.OK);
    }



}