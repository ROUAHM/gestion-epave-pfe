package com.star.epaves.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.star.epaves.entities.Admin;

@Repository("adminRepository")
public interface AdminRepository extends JpaRepository<Admin, Long>{

}
