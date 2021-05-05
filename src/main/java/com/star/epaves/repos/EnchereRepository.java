package com.star.epaves.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.star.epaves.entities.Enchere;
@Repository("enchereRepository")
public interface EnchereRepository extends JpaRepository<Enchere, Long>{

}
