package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.dto.UserDto;
import in.ashokit.service.UserService;
import jakarta.validation.Valid;


@Controller 
public class UserController 
{
	private UserService service;
	
	public UserController(UserService service)
	{
		this.service=service;
	}
	
	
	@GetMapping("/")
	public String index(Model model)
	{
		model.addAttribute("user", new UserDto());
		return "index";
	}
	
	
	@PostMapping("/submit")
	public String HandleSubmit1( @Valid @ModelAttribute("user") UserDto user, BindingResult result, Model model) 
	{
	    System.out.println("Validation errors: " + result.getAllErrors());

	    if (result.hasErrors()) {
	    	model.addAttribute("msg","error occured some fields are missing");
	        return "index"; // back to form
	    }

	    
	    // logic for the database transaction
	    service.save(user);
	    
	    return "redirect:/sending";
	}

	
	
	
	@GetMapping("/sending")
	public String forward(Model model)
	{
		
		model.addAttribute("user", new UserDto());
		
		model.addAttribute("msg","form submitted");
      
		return "index";
	}
	
	@GetMapping("/users")
    public String viewUsers(Model model) {
        model.addAttribute("users", service.getAllUsers());
        return "users"; // ✅ users.html
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Integer id) {
        service.deleteUser(id);
        return "redirect:/users";
    }

    @GetMapping("/edit/{id}")
    public String editUser(@PathVariable Integer id, Model model) {
        UserDto user = service.getUserById(id).orElse(new UserDto());
        model.addAttribute("user", user);
        return "index"; // ✅ reuse same form for edit
    }
	

}

