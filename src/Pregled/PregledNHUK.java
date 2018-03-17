package Pregled;

import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

import Loger.Loger;

public class PregledNHUK extends Pregled {
	
	private String vrednost;
	private LocalTime vremePO;
	Random rand = new Random();
	DecimalFormat df = new DecimalFormat("#.##");

	public String getVrednost() {
		return vrednost;
	}

	public LocalTime getVremePO() {
		return vremePO;
	}

	@Override
	public void pregledUToku() {
		this.vrednost = df.format(rand.nextDouble()*10);
		int sat = rand.nextInt(5)+5;
		int min = rand.nextInt(30)+30;
		this.vremePO = LocalTime.of(sat, min).truncatedTo(ChronoUnit.MINUTES);
	}
	
	

	@Override
	public String toString() {
		return "PregledHUK [vrednost=" + vrednost + ", vremePO=" + vremePO + "]";
	}

	@Override
	public String upisiULog() {
		pregledUToku();
		return "[" + getDatum() + " " + getVreme() + "] Odradjen je pregled merenje nivoa secera u krvi " + 
				" i rezultati su sledeci: vrednost nivoa secera je " + getVrednost() + 
				", a vreme poslednjeg obroka je bilo " + getVremePO() + ".";
	}

}
