package com.star.epaves.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.star.epaves.entities.Epaviste;

@Repository("epavisteRepository")
public interface EpavisteRepository extends JpaRepository<Epaviste, Long> {

}
