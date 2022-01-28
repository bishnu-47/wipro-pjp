package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
	public static void main(String[] args) {
		Veena veena = new Veena();
		veena.play();
		
		Saxophone saxophone = new Saxophone();
		saxophone.play();
		
		Playable instrument;
		instrument = new Veena();
		instrument.play();
		
		instrument = new Saxophone();
		instrument.play();
	}
}
