package com.star.epaves.entities;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client extends User implements Serializable  {
	@Id
	@GeneratedValue( strategy = GenerationType.TABLE )
	private Long id;
	
	@OneToMany(mappedBy = "client")
	 private List<Epave> epaves ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Epave> getEpaves() {
		return epaves;
	}

	public void setEpaves(List<Epave> epaves) {
		this.epaves = epaves;
	}

	public Client(Long id, List<Epave> epaves) {
		super();
		this.id = id;
		this.epaves = epaves;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", epaves=" + epaves + "]";
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(Long id, Long cin, String firstname, String lastname, Date date_naiss, String genre, String tel,
			String etatcivil, String societe, String localite, String mail, Compte comptes) {
		super(id, cin, firstname, lastname, date_naiss, genre, tel, etatcivil, societe, localite, mail, comptes);
		// TODO Auto-generated constructor stub
	}

	
	
}
