package com.sample;

import java.util.Calendar;
import java.util.Date;

public class Rezerwacja {

	private Samochod samochod;
	private Klient klient;
	private Calendar dataPobrania;
	private Calendar dataZwrotu;
	private int znizka;
	private boolean fotelik;
	private boolean bagaznik;
	private Kategoria kategoria;
	
	public Rezerwacja(Klient klient, Calendar dataPobrania, Calendar dataZwrotu, int znizka, boolean fotelik,
			boolean bagaznik, Kategoria kategoria) {
		super();
		this.klient = klient;
		this.dataPobrania = dataPobrania;
		this.dataZwrotu = dataZwrotu;
		this.znizka = znizka;
		this.fotelik = fotelik;
		this.bagaznik = bagaznik;
		this.setKategoria(kategoria);
	}
	
	public Klient getKlient() {
		return klient;
	}
	public void setKlient(Klient klient) {
		this.klient = klient;
	}
	public Samochod getSamochod() {
		return samochod;
	}
	public void setSamochod(Samochod samochod) {
		this.samochod = samochod;
	}
	public Calendar getDataPobrania() {
		return dataPobrania;
	}
	public void setDataPobrania(Calendar dataPobrania) {
		this.dataPobrania = dataPobrania;
	}
	public Calendar getDataZwrotu() {
		return dataZwrotu;
	}
	public void setDataZwrotu(Calendar dataZwrotu) {
		this.dataZwrotu = dataZwrotu;
	}
	public int getZnizka() {
		return znizka;
	}
	public void setZnizka(int znizka) {
		this.znizka = znizka;
	}
	public boolean isBagaznik() {
		return bagaznik;
	}
	public void setBagaznik(boolean bagaznik) {
		this.bagaznik = bagaznik;
	}
	public boolean isFotelik() {
		return fotelik;
	}
	public void setFotelik(boolean fotelik) {
		this.fotelik = fotelik;
	}
	public Kategoria getKategoria() {
		return kategoria;
	}
	public void setKategoria(Kategoria kategoria) {
		this.kategoria = kategoria;
	}
	
	
	
}
