package com.star.epaves.entities;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Admin extends User implements Serializable  {
	@Id
	@GeneratedValue( strategy = GenerationType.TABLE )
	private Long id;	

	@OneToOne
	public  Compte compte;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	

	@Override
	public String toString() {
		return "Admin [id=" + id + ", compte=" + compte + "]";
	}

	
	
	
	public Admin(Long id, Compte compte) {
		super();
		this.id = id;
		this.compte = compte;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(Long id, Long cin, String firstname, String lastname, Date date_naiss, String genre, String tel,
			String etatcivil, String societe, String localite, String mail, Compte comptes) {
		super(id, cin, firstname, lastname, date_naiss, genre, tel, etatcivil, societe, localite, mail, comptes);
		// TODO Auto-generated constructor stub
	}

	
	 
	
	
	
}