package com.hendisantika.controller;

import com.hendisantika.model.Student;
import com.hendisantika.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mustache-crud-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/04/22
 * Time: 15.54
 */
@Slf4j
@Controller
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String getAllStudents(Model model) {
        List<Student> student = studentService.getAllStudents();
        model.addAttribute("student", student);
        return "home";
    }

    @GetMapping("/create")
    public String createStudentPage(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        model.addAttribute("isUpdate", false);
        return "create-update";
    }

    @GetMapping("/update/{id}")
    public String updateStudentPage(Model model, @PathVariable("id") Integer id) {
        Student student = studentService.getStudent(id);
        model.addAttribute("student", student);
        model.addAttribute("isUpdate", true);
        return "create-update";
    }

    @PostMapping("/update/{id}")
    public String createStudent(@ModelAttribute("student") Student student, @PathVariable("id") Integer id) {
        studentService.updateStudent(student, id);
        return "redirect:/";
    }

}
