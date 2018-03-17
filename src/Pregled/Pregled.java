package Pregled;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import Loger.Loger;

public abstract class Pregled implements ispisivanjePregleda {

	private LocalDate datum;
	private LocalTime vreme;
	private Loger loger;
	Random rand = new Random();
	DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
	String datumUStringu;
	
	public Pregled() {
		this.datum = LocalDate.now().plusDays(rand.nextInt(14));
		this.vreme = LocalTime.now().plusHours(rand.nextInt(7)).truncatedTo(ChronoUnit.MINUTES);
	}
	
	public void setLoger(Loger loger) {
		this.loger = loger;
	}

	public Loger getLoger() {
		return loger;
	}

	public String getDatum() {
		return datumUStringu = datum.format(formater);
	}

	public LocalTime getVreme() {
		return vreme;
	}

	public abstract void pregledUToku();
	
	/* (non-Javadoc)
	 * @see Pregled.ispisivanjePregleda#upisiULog()
	 */
	@Override
	public abstract String upisiULog();
	
	@Override
	public String toString() {
		return "Pregled [datum=" + datum + "]";
	}
	
}
