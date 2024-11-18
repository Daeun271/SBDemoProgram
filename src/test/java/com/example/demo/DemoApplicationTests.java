package com.example.demo;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Repository.QuestionRepository;
import com.example.demo.Entity.Question;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void testJpa() {
		Question q1 = new Question();
		q1.setSubject("How to use JPA?");
		q1.setContent("I want to know how to use JPA in Spring Boot.");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1);

		Question q2 = new Question();
		q2.setSubject("How to use Thymeleaf?");
		q2.setContent("I am new to Thymeleaf. Please tell me how to use it.");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2);
	}

}
