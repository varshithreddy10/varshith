package in.ashokit.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;


@Data
@Entity
public class UserDto 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message = "name is mandatory")
    private String name;

    @NotEmpty(message = "email is mandatory")
    @Email(message = "write proper email")
    private String email;

    @NotEmpty(message = "phno is mandatory")
    
    private String phno;

}

