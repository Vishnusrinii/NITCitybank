package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.beans.Utility;

@SpringBootApplication
public class MyFirstDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstDemo1Application.class, args);
		Utility u=new Utility();
		System.out.println(u.getDate());
	}

}
