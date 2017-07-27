package radionica;

public class Avion implements Vozilo{

private TipVozila tipVozila;
	
	public Avion(TipVozila tipVozila){
		this.tipVozila=tipVozila;
	}

	public TipVozila getTipVozila() {
		return tipVozila;
	}

	
}
