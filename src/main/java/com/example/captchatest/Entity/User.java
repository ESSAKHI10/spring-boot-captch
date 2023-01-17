package com.example.captchatest.Entity;

import javax.persistence.Entity;
import javax.persistence.Transient;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;

    @Transient
    private String captcha;
    @Transient
    private String hiddenCaptcha;

    @Transient
    private String realCaptcha;

}
