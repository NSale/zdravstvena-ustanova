package Client;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import Loger.Loger;
import Osobe.Doktor;
import Osobe.Pacijent;
import Pregled.Pregled;
import Pregled.PregledFactory;
import Pregled.TipPregleda;

public class Bolnica {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		
		Loger loger = Loger.getInstance();
		Doktor doktor = new Doktor("Milan", "Milanic", "opsta praksa",loger);
		Pacijent pacijent = new Pacijent("Dragan", "Draganic", 1006984986, 12345679,loger);
		pacijent.izaberiDoktora(doktor);
		PregledFactory pf = new PregledFactory();
		Pregled pregled1 = pf.getPregled(TipPregleda.KP);
		pregled1.setLoger(loger);
		Pregled pregled2 = pf.getPregled(TipPregleda.NSUK);
		pregled2.setLoger(loger);
		doktor.zakaziPregled(pregled2, pacijent);
		doktor.zakaziPregled(pregled1, pacijent);
		
		PrintWriter writer = new PrintWriter("Log.txt", "UTF-8");
		writer.println(loger.logujOsobu(doktor));
		writer.println(loger.logujOsobu(pacijent));
		writer.println(loger.logujIzabranogDoktora(pacijent, doktor));
		writer.println(loger.prikaziRezultatePregleda(pregled2));
		writer.println(loger.prikaziRezultatePregleda(pregled1));
		writer.close();
	}
}
