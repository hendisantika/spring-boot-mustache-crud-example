package com.hendisantika.controller;

import com.hendisantika.model.Student;
import com.hendisantika.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
