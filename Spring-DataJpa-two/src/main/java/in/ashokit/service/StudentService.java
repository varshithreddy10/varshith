package in.ashokit.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Student;
import in.ashokit.repository.StudentRepo;



@Service	
public class StudentService 
{
	private StudentRepo studentrepo;
	
	public StudentService(StudentRepo studentrepo)
	{
		this.studentrepo=studentrepo;
	}
	
	public List<Student> findAll()
	{
		List<Student> students = studentrepo.findAll();
		
		return students;
	}
	
	public void add()
	{
		Student student = new Student();

		student.setName("Alice");
		student.setAge(22);
		student.setCity("Delhi");
		student.setEmail("alice@gmail.com");
		student.setCourse("B.Tech");
		student.setGpa(8.5);
		student.setGender("Female");
		student.setPhoneNumber("9876543210");
		student.setDepartment("CSE");

		studentrepo.save(student);
	}
	
	public List<Student> findbygender(String gender)
	{
		List<Student> students = studentrepo.findByGender(gender);
		return students;
	}
	
	public List<Student> findByAge(int age)
	{
		List<Student> students = studentrepo.findByAge(age);
		return students;
	}
	
	public List<Student> findByAgeAndGenderAndCity(int age , String gender ,String city)
	{
		List<Student> students = studentrepo.findByAgeAndGenderAndCity(age, gender, city);
		return students;
	}
	

	
	public List<Student> findAllUsers()
	{
		List<Student> students = studentrepo.findAllUsers();
		return students;
	}
	
	public List<Student> getAllUsers()
	{
		List<Student> students = studentrepo.getAllUsers();
		return students;
	}
	
	public List<Student> findaAll(Example<Student> example) {
	    List<Student> students = studentrepo.findAll(example);
	    return students;
	}
	
	
	

}
