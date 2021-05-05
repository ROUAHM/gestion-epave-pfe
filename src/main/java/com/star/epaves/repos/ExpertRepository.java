package com.star.epaves.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.star.epaves.entities.Expert;
@Repository("expertrepository")
public interface ExpertRepository extends JpaRepository<Expert, Long>{

}
