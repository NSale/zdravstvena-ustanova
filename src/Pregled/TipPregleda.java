package Pregled;

public enum TipPregleda {
	
	KP {
		public Pregled getPregled() {
			return new PregledKP();
		}
	},
	NHUK {
		public Pregled getPregled() {
			return new PregledNHUK();
		}
	},
	NSUK {
		public Pregled getPregled() {
			return new PregledNSUK();
		}
	};
	
	abstract Pregled getPregled();
	
}
