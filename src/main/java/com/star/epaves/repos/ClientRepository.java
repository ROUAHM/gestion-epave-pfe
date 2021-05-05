package com.star.epaves.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.star.epaves.entities.Client;

@Repository("clientrepository")
public interface ClientRepository extends JpaRepository<Client, Long>{

}
