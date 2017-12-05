package com.sample;

public class Samochod {

	private Kategoria kategoria;
	private boolean wypozyczony;
	
	public Samochod(Kategoria kat) {
		this.kategoria = kat;
		this.wypozyczony = false;
	}
	
	public Kategoria getKategoria() {
		return kategoria;
	}
	public void setKategoria(Kategoria kategoria) {
		this.kategoria = kategoria;
	}
	public boolean isWypozyczony() {
		return wypozyczony;
	}
	public void setWypozyczony(boolean wypozyczony) {
		this.wypozyczony = wypozyczony;
	}
}
