package com.vivek;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vivek.Entity.Employee;
import com.vivek.Repo.EmpRepo;

@SpringBootApplication
public class SpringBootCrudRepoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootCrudRepoApplication.class, args);
		EmpRepo bean = run.getBean(EmpRepo.class);
		
//		Employee emp  = new Employee();
//		emp.setEmpId(2);
//		emp.setEmpName("Pandu");
//		emp.setEmpPost("developer");
//		emp.setEmpSalary(30000.00);
//		bean.save(emp);
//		
//		Employee emp1  = new Employee();
//		emp1.setEmpId(3);
//		emp1.setEmpName("Neeraj");
//		emp1.setEmpPost("Tester");
//		emp1.setEmpSalary(25000.00);
//		bean.save(emp);
//		bean.saveAll(Arrays.asList(emp,emp1));
//		System.out.println("Data Insert!!!");
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//		long count = bean.count();
//		System.out.println(count);
//++++++++++++++++++++++++++++++++++++++++++
//		
//		Optional<Employee> id = bean.findById(1);
//		 if(id.isPresent()) {
//			 System.out.println(id);
//		 }
		
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//        boolean byId = bean.existsById(1);
//        System.out.println(byId);
//		++++++++++++++++++++++++++++++++++++++++++++++++++
//		Iterable<Employee> id = bean.findAllById(Arrays.asList(1,3,5,6));
//		for(Employee status:id) {
//			System.out.println(status);
//	+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//		Iterable<Employee> all = bean.findAll();
//		for(Employee emp:all) {
//			System.out.println(emp);
//		}
     //deleteById();
//		deleteAllById
//		delete(Entity)
//		deleteAll(Itrable entity)
//		DeleteAll
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++		
		 
//		if(bean.existsById(3)) {
//			bean.deleteById(3);
//		}else
//		System.out.println("Record Not Found");
//	}

}
