package Loger;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import Osobe.UzmiIme;
import Pregled.ispisivanjePregleda;

public class Loger {
	
	private static Loger INSTANCE = null;
	LocalTime localTime = LocalTime.now().truncatedTo(ChronoUnit.MINUTES);
	LocalDate localDate = LocalDate.now();//For reference
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
	String datum = localDate.format(formatter);
	String datumIVreme = datum + " " + localTime;

	private Loger() {
		
	}
	
	public static Loger getInstance() {
		if(INSTANCE == null) {
			return new Loger();
		}
		return INSTANCE;
	}
	
	public String logujOsobu(UzmiIme osoba) {
//		System.out.println("[" + datumIVreme + "] Kreiran je " + osoba.getClass().getName().substring(6) + " " + osoba.getIme() + ".");
		return "[" + datumIVreme + "] Kreiran je " + osoba.getClass().getName().substring(6) + " " + osoba.getIme() + ".";
	}
	
	public String logujIzabranogDoktora(UzmiIme pacijent,UzmiIme doktor) {
//		System.out.println("[" + datumIVreme + "] Pacijent " + pacijent.getIme() + " je izabrao doktora " + doktor.getIme() + " za svog odabranog lekara.");
		return "[" + datumIVreme + "] Pacijent " + pacijent.getIme() + " je izabrao doktora " + doktor.getIme() + " za svog odabranog lekara.";
	}
	
	public String prikaziRezultatePregleda(ispisivanjePregleda pregled) {
//		System.out.println(pregled.upisiULog());
		return pregled.upisiULog();
	}
	
}
