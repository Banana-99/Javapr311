package com.supinfo.java.chap2;

import java.time.LocalDate;

public class Inscription {
	
	private long id;
	private LocalDate date;
	private static int compteur = 0;
	
	public Inscription( )
	{
		Inscription.compteur++;
		this.id = Inscription.compteur;
	}
	
	public Inscription(LocalDate date) {
		this();
		this.date = date;
	}

	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public static int getCompteur() {
		return compteur;
	}

	public static void setCompteur(int compteur) {
		Inscription.compteur = compteur;
	}

	@Override
	public String toString() {
		return "Inscription [id=" + id + ", date=" + date + "]";
	}
	
}
