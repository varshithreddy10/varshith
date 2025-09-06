package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.ashokit.dto.UserDto;
import in.ashokit.repository.UserRepo;


@Service
public class UserService 
{
	private UserRepo repo ;
	
	public UserService(UserRepo repo)
	{
		this.repo=repo;
	}
	
	public void save(UserDto user)
	{
		repo.save(user);
	}
	
	public List<UserDto> getAllUsers() {
        return repo.findAll();
    }

    public void deleteUser(Integer id) {
        repo.deleteById(id);
    }

    public Optional<UserDto> getUserById(Integer id) {
        return repo.findById(id);
    }

}



