public class SomaAreas {

	
	public SomaAreas() {
		
	}
	
	
	public <T extends Superficie> double calculaArea(T[] formas) {
		
		double total = 0.0;
		
		for(Superficie object : formas) {
			total += object.area();
		}
		
		return total;
	}

}
