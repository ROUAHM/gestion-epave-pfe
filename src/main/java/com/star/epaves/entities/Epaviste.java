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
public class Epaviste extends User implements Serializable {
	@Id
	@GeneratedValue( strategy = GenerationType.TABLE )
	private Long id;
	
	@OneToMany(mappedBy = "epaviste")
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
	public Epaviste(Long id, List<Epave> epaves) {
		super();
		this.id = id;
		this.epaves = epaves;
	}
	@Override
	public String toString() {
		return "Epaviste [id=" + id + ", epaves=" + epaves + "]";
	}
	public Epaviste() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Epaviste(Long id, Long cin, String firstname, String lastname, Date date_naiss, String genre, String tel,
			String etatcivil, String societe, String localite, String mail, Compte comptes) {
		super(id, cin, firstname, lastname, date_naiss, genre, tel, etatcivil, societe, localite, mail, comptes);
		// TODO Auto-generated constructor stub
	}
	
	
}
