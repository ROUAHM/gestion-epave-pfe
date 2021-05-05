package com.star.epaves.entities;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
@Entity
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS )

public abstract class User  implements Serializable {
	@Id
	@GeneratedValue( strategy = GenerationType.TABLE )
	private Long id;
	private Long cin;
	    private String firstname;
	    private String lastname;
	    private Date date_naiss;
	    private String genre;
	    private String tel;
	    private String etatcivil;
	    private String societe;
	    private String localite;
	    private String mail;
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getCin() {
			return cin;
		}
		public void setCin(Long cin) {
			this.cin = cin;
		}
		
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		
		public Date getDate_naiss() {
			return date_naiss;
		}
		public void setDate_naiss(Date date_naiss) {
			this.date_naiss = date_naiss;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getEtatcivil() {
			return etatcivil;
		}
		public void setEtatcivil(String etatcivil) {
			this.etatcivil = etatcivil;
		}
		public String getSociete() {
			return societe;
		}
		public void setSociete(String societe) {
			this.societe = societe;
		}
		public String getLocalite() {
			return localite;
		}
		public void setLocalite(String localite) {
			this.localite = localite;
		}
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
		
		
		
		public User(Long id, Long cin, String firstname, String lastname, Date date_naiss, String genre, String tel,
				String etatcivil, String societe, String localite, String mail, Compte comptes) {
			super();
			this.id = id;
			this.cin = cin;
			this.firstname = firstname;
			this.lastname = lastname;
			this.date_naiss = date_naiss;
			this.genre = genre;
			this.tel = tel;
			this.etatcivil = etatcivil;
			this.societe = societe;
			this.localite = localite;
			this.mail = mail;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", cin=" + cin + ", firstname=" + firstname + ", lastname=" + lastname
					+ ", date_naiss=" + date_naiss + ", genre=" + genre + ", tel=" + tel + ", etatcivil=" + etatcivil
					+ ", societe=" + societe + ", localite=" + localite + ", mail=" + mail + "]";
		}
		
		
		
		
	   
	    
}
