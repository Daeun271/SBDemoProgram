package com.example.demo.Validator;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {
    @NotEmpty(message="Subject is required")
    @Size(max=200)
    private String subject;

    @NotEmpty(message="Content is required")
    private String content;
}
