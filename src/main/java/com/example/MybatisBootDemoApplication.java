package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisBootDemoApplication {

  public static void main(String[] args) {
    printf("I am zhangjian.");
    SpringApplication.run(MybatisBootDemoApplication.class, args);
  }
}
