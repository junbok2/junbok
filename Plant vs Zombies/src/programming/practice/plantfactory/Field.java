package programming.practice.plantfactory;


public class Field {
	
	public Plant orderPlant(String PlantName) {
		Plant plant = SimplePlantFactory.createPlant(PlantName);
	
		if(plant == null) {
			return null;
		}
	
		plant.display();
		
		return plant;
	}
}
