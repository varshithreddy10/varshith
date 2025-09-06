package in.ashokit.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
@Entity
public class Student 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;        // Student name
    private int age;            // Age
    private String city;        // City of residence
    private String email;       // Email address
    private String course;      // Course enrolled (e.g., B.Tech, MBA)
    private double gpa;         // Grade Point Average
    private String gender;      // Male / Female / Other
    private String phoneNumber; // Contact number
    private String department;  // Department (e.g., CSE, ECE, Finance)
}
