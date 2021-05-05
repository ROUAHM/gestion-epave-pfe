package com.star.epaves.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.star.epaves.entities.Offre;
@Repository("offrerepository")
public interface OffreRepository extends JpaRepository<Offre,Long> {

}
