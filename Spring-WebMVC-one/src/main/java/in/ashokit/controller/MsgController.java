package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import in.ashokit.dto.UserDto;
import jakarta.validation.Valid;



@Controller
public class MsgController 
{
	
	
	@GetMapping("/greet")
	@ResponseBody
	public String HandleMsg(@RequestParam("name") String name  )
	{
		String msg = name + " you are late ";
		
		return msg;
	}
	
	
	@GetMapping("/welcome/{name}")
	@ResponseBody
	public String getWelcome(@PathVariable String name  )
	{
		String msg = name + " you are late ";
		
		return msg;
	}
	
	
	@GetMapping("/start")
	public String index(Model model)
	{
		model.addAttribute("user", new UserDto());
		return "index";
	}
	
	

	
	@PostMapping("/user-submit")
	public String HandleSubmit1( @Valid @ModelAttribute("user") UserDto user, BindingResult result, Model model) 
	{

	    
	    System.out.println("Validation errors: " + result.getAllErrors());

	    if (result.hasErrors()) {
	    	model.addAttribute("msg","error occured");
	        return "index"; // back to form
	    }

	    return "redirect:/hello";
	}

	
	@GetMapping("/hello")
	public String hello(Model model)
	{
		
		model.addAttribute("user", new UserDto());
		
		model.addAttribute("msg","form submitted");
         
		
		return "index";
	}
	
	
	

}
