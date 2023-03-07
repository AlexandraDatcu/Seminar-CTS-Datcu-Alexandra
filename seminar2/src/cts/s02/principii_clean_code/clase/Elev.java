package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static Integer sumafinantata;
	
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int i) {
		this.clasa = i;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		return "Elev: Nume=" + nume + ", Prenume=" + prenume + ", Varsta="
				+ varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrproiecte + ", DenumireProiect="
				+ Arrays.toString(denumiriProiecte) + "Clasa=" + clasa + ", Tutore=" + tutore;
	}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	public static void setSumafinantata(Integer sumafinantata) {
		Elev.sumafinantata = sumafinantata;
	}

	public static Integer getSumafinantata() {
		return sumafinantata;
	}

	public void afisareFinantare() {
		System.out.println("Elevul "+ super.getNume()+" "+ super.getPrenume()+" primeste "+ Angajat.getSumaFinantata() + " Euro/zi in proiect.");
	}
	
}
