package Osobe;

public abstract class Osoba implements UzmiIme {

	private String ime;
	private String prezime;
	
	public Osoba(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}

	/* (non-Javadoc)
	 * @see Osobe.UzmiIme#getIme()
	 */
	@Override
	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}
	
	@Override
	public String toString() {
		return "Osoba [ime=" + ime + ", prezime=" + prezime + "]";
	}
	
}
