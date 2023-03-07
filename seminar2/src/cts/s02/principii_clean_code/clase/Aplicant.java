package cts.s02.principii_clean_code.clase;

import java.util.Scanner;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrproiecte;
	protected String[] denumiriProiecte;
	protected static Integer pragAcceptat = 80;

	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void afisareStatut() {
		System.out.println("Aplicantul " + this.nume + " " + this.prenume + (this.punctaj > Aplicant.pragAcceptat ?  "" : " nu ")
				+ " a fost acceptat");
	}
	public int getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	public Aplicant() {
		super();
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrproiecte = nr_proiecte;
		this.denumiriProiecte = denumireProiect;
	}
	public int getNrproiecte() {
		return nrproiecte;
	}

	public String[] getDenumiriProiecte() {
		return denumiriProiecte;
	}
	public void setDenumiriProiecte(String[] denumiriProiecte) {
		this.denumiriProiecte = denumiriProiecte;
	}

	public void setNrproiecte(int nrProiecte) {
		this.nrproiecte = nrProiecte;
	}
	public abstract void afisareFinantare();

}
