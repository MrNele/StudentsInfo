package com.example.studentsinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController //klasa usluzuje rest endpointe kao sto su JSON,xml...
public class StudentsInfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentsInfoApplication.class, args);
    }

   /* @GetMapping//ovo je nas rest endpoint
    public String hello(){
        return "pozz";
    }*/
   @GetMapping//ovo je nas rest endpoint
   public List<String> hello(){
       return List.of("pozz","care");

   }
}
