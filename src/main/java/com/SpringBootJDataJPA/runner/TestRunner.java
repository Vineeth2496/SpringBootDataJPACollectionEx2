package com.SpringBootJDataJPA.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringBootJDataJPA.model.Student;
import com.SpringBootJDataJPA.repo.StudentRepository;
@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private StudentRepository repo;
	@Override
	public void run(String... args) throws Exception {

		repo.save(
				new Student(101, "Vikram", 3000.00,
						List.of(79, 89, 36, 45),
						Set.of("Math", "English", "Physics", "Chemistry"),
						Map.of("12","B", "11","A", "10", "B", "9", "C")
						)
				);
		System.out.println("DONE");


	}

}
