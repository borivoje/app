package radionica;

public class Automobil implements Vozilo{

	private TipVozila tipVozila;
	
	public Automobil(TipVozila tipVozila){
		this.tipVozila=tipVozila;
	}

	public TipVozila getTipVozila() {
		return tipVozila;
	}
	
	
}
