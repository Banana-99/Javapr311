package com.supinfo.java.chap2;

import java.time.LocalDate;

public class TestIncriptionNiveauAnneeAcademique {

	public static void main(String[] args) {
		
		Inscription inscription1 = new Inscription();
		AnneeAcademique anneeacademique1 = new AnneeAcademique();
		Niveau niveau1 = new Niveau();
		
		LocalDate date = LocalDate.parse("2003-05-25");
		inscription1.setDate(date);
		
		anneeacademique1.setLibelle(" POO ");
		anneeacademique1.setDescription(" Programmation orientée objet ");
		
		niveau1.setDesignation(" Licence 2 ");
		
		System.out.println(inscription1);
		System.out.println(anneeacademique1);
		System.out.println(niveau1);
		
	}

}
