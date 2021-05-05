package com.star.epaves.repos;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.star.epaves.entities.User;
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long>{
	 /*@Autowired
	 JdbcTemplate jdbcTemplate;
	 
	
	public List<String> getAllUserNames() {
		List<String> userNameList = new ArrayList<>();
		 //userNameList.addAll(jdbcTemplate.queryForList("select name from user;", String.class));
		  return userNameList;
	}*/

}
