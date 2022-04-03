package com.hendisantika.service;

import com.hendisantika.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mustache-crud-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/04/22
 * Time: 15.44
 */
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
}
