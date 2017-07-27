package radionica;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		TipVozila tip1 = TipVozila.vazdusni;
		TipVozila tip2 = TipVozila.kopneni;
		TipVozila tip3 = TipVozila.vodeni;
		
		Vozilo v1 = new Avion(tip1);
		Vozilo v2 = new Avion(tip1);
		Vozilo v3 = new Automobil(tip2);
		Vozilo v4 = new Automobil(tip2);
		Vozilo v5 = new Automobil(tip2);

		HashMap<Integer,Vozilo> vozila = new HashMap<Integer,Vozilo>();
		vozila.put(1, v1);
		vozila.put(2, v2);
		vozila.put(3, v3);
		vozila.put(4, v4);
		vozila.put(5, v5);

		printEnumValues();
		hashMapIterator(vozila);		
		vozila.remove(3);
		hashMapEntry(vozila);
		
	}
	private static void printEnumValues(){
		for(TipVozila view : TipVozila.values()){
			System.out.println(view);
		}
	}
	private static void hashMapIterator(HashMap<Integer,Vozilo> vozila){
		Set keys = vozila.keySet();
		for(Iterator i= keys.iterator();i.hasNext();){
			int key=(Integer)i.next();
			TipVozila value = (TipVozila)vozila.get(key).getTipVozila();
			System.out.println("key : "+key+", value = "+value);
		}
	}
	private static void hashMapEntry(HashMap<Integer,Vozilo> vozila){
		for(Map.Entry<Integer, Vozilo>entry : vozila.entrySet()) {
		    System.out.println(entry.getKey()+" : "+entry.getValue().getTipVozila());
		}
	}
}
