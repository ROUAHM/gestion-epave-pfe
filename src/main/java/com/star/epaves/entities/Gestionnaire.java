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
public class Gestionnaire extends User  implements Serializable {
	@Id
	@GeneratedValue( strategy = GenerationType.TABLE )
	private Long id;	
	@OneToMany(mappedBy = "gestionnaire")
	 private List<Epave> epave ;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public List<Epave> getEpave() {
		return epave;
	}
	public void setEpave(List<Epave> epave) {
		this.epave = epave;
	}

	@Override
	public String toString() {
		return "Gestionnaire [id=" + id + ", epave=" + epave +  "]";
	}

	public Gestionnaire(Long id, List<Epave> epave) {
		super();
		this.id = id;
		this.epave = epave;

	}

	public Gestionnaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gestionnaire(Long id, Long cin, String firstname, String lastname, Date date_naiss, String genre, String tel,
			String etatcivil, String societe, String localite, String mail, Compte comptes) {
		super(id, cin, firstname, lastname, date_naiss, genre, tel, etatcivil, societe, localite, mail, comptes);
		// TODO Auto-generated constructor stub
	}	
}