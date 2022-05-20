package com.example.crud;

import com.example.crud.model.Employee;
import com.example.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		//add some people to DB
//		Employee employee = new Employee();
//		employee.setFirstName("firstname");
//		employee.setLastName("lastname");
//		employee.setEmailId("email@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Pawel");
//		employee1.setLastName("Pan");
//		employee1.setEmailId("PANPAWEL@gmail.com");
//		employeeRepository.save(employee1);
	}
}
