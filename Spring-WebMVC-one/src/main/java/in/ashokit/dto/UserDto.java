
 package in.ashokit.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UserDto {
	

	private Integer id;
	
    @NotEmpty(message = "name is mandatory")
    private String name;

    @NotEmpty(message = "email is mandatory")
    @Email(message = "write proper email")
    private String email;

    @NotEmpty(message = "phno is mandatory")
    
    private String phno;
}


