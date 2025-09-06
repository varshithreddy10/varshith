package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

import in.ashokit.entity.Student;
import in.ashokit.service.StudentService;

@SpringBootApplication
public class SpringDataJpaTwoApplication {

	public static void main(String[] args) 
	{
	  ConfigurableApplicationContext ctxt	=SpringApplication.run(SpringDataJpaTwoApplication.class, args);
	  
	 StudentService studentservice = ctxt.getBean(StudentService.class);
	  
	 studentservice.add();
	 
//	 List<Student> students = studentservice.findAll();
//	 students.forEach(System.out::println);
	 
//	 List<Student> student1 = studentservice.findbygender("female");
//	 student1.forEach(System.out::println);
	 
//	 List<Student>   s2 = studentservice.findByAgeGreaterThanEqual(22);
//	 s2.forEach(System.out::println);
	 
//	 List<Student>   s3 = studentservice.findByAge(22);
//	 s3.forEach(System.out::println);
	 
/* List<Student>   s4 = studentservice.findByAgeAndGenderAndCity(21, "male", "hyderabad");
     s4.forEach(System.out::println);*/
	 
//	 List<Student>   s5 = studentservice.findAllUsers();
//	 s5.forEach(System.out::println);
	 
//	 List<Student>   s6 = studentservice.getAllUsers();
//	 s6.forEach(System.out::println);
	 
	 
//	 Student s = new Student();
//	 s.setAge(22);
//	 Example<Student> example = Example.of(s);
//	 
//	 List<Student> s7 = studentservice.findaAll(example);
//	 s7.forEach(System.out::println);
	 
	// QBE Example - match students with age = 22
     Student s = new Student();
     s.setName("alice");
     
  // Tell matcher to ignore fields you don’t want in WHERE
     ExampleMatcher matcher = ExampleMatcher.matching()
             .withIgnorePaths("gpa", "course", "department", "email", "gender", "phoneNumber","age");

     Example<Student> example = Example.of(s,matcher);

     System.out.println("=== Students with age = 22 ===");
     studentservice.findaAll(example).forEach(System.out::println);
	 
	}

}
