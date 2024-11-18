package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    
}
