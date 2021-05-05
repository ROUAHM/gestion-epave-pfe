package com.star.epaves.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.star.epaves.entities.Compte;
@Repository("compterepository")
public interface CompteRepository extends JpaRepository<Compte, Long>{

}
