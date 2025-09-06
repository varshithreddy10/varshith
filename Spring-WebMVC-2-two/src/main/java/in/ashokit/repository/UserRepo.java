package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.dto.UserDto;


@Repository
public interface UserRepo extends JpaRepository<UserDto , Integer>
{

}

