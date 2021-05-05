package com.star.epaves.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.star.epaves.entities.Epave;
@Repository("epaverepository")
public interface EpaveRepository  extends JpaRepository<Epave, Long>{

}
