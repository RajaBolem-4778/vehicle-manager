public class Vehicle{
	
	public static void main(String args[]) {
		PetrolEngine PE = new PetrolEngine;
		PE.start();
		PE.stop();
		
		DeiselEngine DE = new DeiselEngine;
		DE.start();
		DE.stop();
		
		ElectricEngine EE = new ElectricEngine;
		EE.start();
		EE.stop();
	}
}