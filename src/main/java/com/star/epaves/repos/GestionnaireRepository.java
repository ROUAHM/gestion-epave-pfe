package com.star.epaves.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.star.epaves.entities.Gestionnaire;

@Repository("GestionnaireRepository")
public interface GestionnaireRepository extends JpaRepository<Gestionnaire, Long> {

}
