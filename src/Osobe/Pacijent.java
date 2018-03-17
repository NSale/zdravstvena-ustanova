package Osobe;

import Loger.Loger;
import Pregled.ispisivanjePregleda;

public class Pacijent extends Osoba implements ObavljanjePregleda{

	private long jmbg;
	private long brojZK;
	private Loger loger;
	private Doktor izabraniDoktor= null;
	
	public Pacijent(String ime, String prezime, long jmbg, long brojZK, Loger loger) {
		super(ime, prezime);
		this.jmbg = jmbg;
		this.brojZK = brojZK;
		this.loger = loger;
		loger.logujOsobu(this);
	}
	
//	@Override
//	public void upisiULog(Osoba osoba) {
//		loger.logujOsobu(osoba);
//	}

	/* (non-Javadoc)
	 * @see Osobe.PacijentObavljaPregled#obavljaPregled(Pregled.ispisivanjePregleda)
	 */
	@Override
	public void obavljaPregled(ispisivanjePregleda pregled) {
		loger.prikaziRezultatePregleda(pregled);
	}
	
	public void izaberiDoktora(Doktor doktor) {
		this.izabraniDoktor = doktor;
		doktor.dodajPacijenta(this);
		loger.logujIzabranogDoktora(this,doktor);
	}
	
	@Override
	public String toString() {
		return "Pacijent [ime=" + super.getIme() + ", prezime=" + super.getPrezime() + ", jmbg=" + jmbg + ", brojZK=" + brojZK + "]";
	}
}
