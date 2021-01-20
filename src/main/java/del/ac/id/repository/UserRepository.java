package del.ac.id.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import del.ac.id.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{
	
}
