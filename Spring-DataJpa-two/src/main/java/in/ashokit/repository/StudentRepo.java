package in.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student , Integer>
{
  
	public List<Student> findByGender(String gender);
	public List<Student> findByAgeGreaterThanEqual(int age);
	public List<Student> findByAge(int age);
	public List<Student> findByAgeAndGenderAndCity(int age,String gender,String city);
	
	@Query(value = "SELECT * FROM Student WHERE gender = 'female' AND age = 20 and department = 'cse'", nativeQuery = true)
    List<Student> findAllUsers();
	
	@Query(value = "select * from student" , nativeQuery = true)
	List<Student> getAllUsers();
	
}
