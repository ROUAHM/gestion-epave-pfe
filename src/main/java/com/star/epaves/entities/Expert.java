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
public class Expert extends User implements Serializable  {
	@Id
	@GeneratedValue( strategy = GenerationType.TABLE )
	
	private Long id;
	@OneToMany(mappedBy = "expert")
	 private List<RapportPreliminaire> rapportpreliminaires ;
	@OneToMany(mappedBy = "expert")
	 private List<Epave> epaves ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<RapportPreliminaire> getRapportpreliminaires() {
		return rapportpreliminaires;
	}
	public void setRapportpreliminaires(List<RapportPreliminaire> rapportpreliminaires) {
		this.rapportpreliminaires = rapportpreliminaires;
	}
	public List<Epave> getEpaves() {
		return epaves;
	}
	public void setEpaves(List<Epave> epaves) {
		this.epaves = epaves;
	}
	@Override
	public String toString() {
		return "Expert [id=" + id + ", rapportpreliminaires=" + rapportpreliminaires + ", epaves=" + epaves + "]";
	}
	public Expert(Long id, List<RapportPreliminaire> rapportpreliminaires, List<Epave> epaves) {
		super();
		this.id = id;
		this.rapportpreliminaires = rapportpreliminaires;
		this.epaves = epaves;
	}
	public Expert() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Expert(Long id, Long cin, String firstname, String lastname, Date date_naiss, String genre, String tel,
			String etatcivil, String societe, String localite, String mail, Compte comptes) {
		super(id, cin, firstname, lastname, date_naiss, genre, tel, etatcivil, societe, localite, mail, comptes);
		// TODO Auto-generated constructor stub
	}
		
	
	
}
