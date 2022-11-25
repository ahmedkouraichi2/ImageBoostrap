package com.techgeeknext.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table
@Getter
@Setter
@Data
@ToString

public class Patient {
	

	
	@Id @GeneratedValue(strategy = GenerationType. IDENTITY )
	private  Long id;
	@Column(name="TestName")
	private String nom;
	
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	private int score ;
	private boolean malade;

	public Patient() {
		
	}

	public Patient(Long id, String nom, Date dateNaissance, int score, boolean malade) {
		
		this.id = id;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		this.score = score;
		this.malade = malade;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean isMalade() {
		return malade;
	}

	public void setMalade(boolean malade) {
		this.malade = malade;
	}

	 
	
	
	
	
	  
	
	
	

}
