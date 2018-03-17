package Pregled;

import java.util.Random;

import Loger.Loger;
import Pregled.Pregled;

public class PregledKP extends Pregled {

	private int gornjaVrednost;
	private int donjaVrednost;
	private int puls;
	private Random rand = new Random();

	@Override
	public void pregledUToku() {
		this.donjaVrednost = rand.nextInt(40)+60;
		this.gornjaVrednost = rand.nextInt(120)+60;
		this.puls = rand.nextInt(60)+60;
	}

	public int getGornjaVrednost() {
		return gornjaVrednost;
	}

	public int getDonjaVrednost() {
		return donjaVrednost;
	}

	public int getPuls() {
		return puls;
	}
	
	@Override
	public String upisiULog() {
		pregledUToku();
		return "[" + getDatum() + " " + getVreme() + "] Odradjen je pregled merenje krvnog pritiska " + 
				" i rezultati su sledeci: gornja vrednost je " + getGornjaVrednost() + 
				", donja vrednost je " + getDonjaVrednost() + ", a puls je " + getPuls() + ".";
		
	}

	@Override
	public String toString() {
		return "PregledKP [gornjaVrednost=" + gornjaVrednost + ", donjaVrednost=" + donjaVrednost + ", puls=" + puls
				+ "]";
	}
	
}