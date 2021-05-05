package com.star.epaves.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.star.epaves.entities.Vehicule;


@Repository("vehiculeRepository")

public interface VehiculeRepository extends JpaRepository<Vehicule, Long>{

}
