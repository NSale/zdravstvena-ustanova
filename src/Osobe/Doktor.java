package Osobe;

import java.util.ArrayList;
import java.util.List;

import Loger.Loger;
import Pregled.ispisivanjePregleda;

public class Doktor extends Osoba implements ZakazivanjePregleda{

	private String specijalnost;
	private List<Pacijent> listaPacijenata = new ArrayList<Pacijent>();
	private Loger loger;

	public Doktor(String ime, String prezime, String specijalnost, Loger loger) {
		super(ime, prezime);
		this.specijalnost = specijalnost;
		this.loger = loger;
		loger.logujOsobu(this);
	}
	
	/* (non-Javadoc)
	 * @see Osobe.DodavanjePacijenta#dodajPacijenta(Osobe.Pacijent)
	 */
	@Override
	public void dodajPacijenta(Pacijent pacijent) {
		listaPacijenata.add(pacijent);
	}
	
	public void zakaziPregled(ispisivanjePregleda pregled, ObavljanjePregleda pacijent) {
		pacijent.obavljaPregled(pregled);
	}

	@Override
	public String toString() {
		return "Doktor [ime=" + super.getIme() + ", prezime=" + super.getPrezime() + ", specijalnost=" + specijalnost + ", listaPacijenata="
				+ listaPacijenata + "]";
	}
	
}
