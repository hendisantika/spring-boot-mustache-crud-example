package com.hendisantika.repository;

import com.hendisantika.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mustache-crud-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/04/22
 * Time: 15.43
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
