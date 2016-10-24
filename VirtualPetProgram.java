package VirtualPetProject;

public class VirtualPetProgram {

	public static void main(String[] args) {

		VirtualPetClass lola = new VirtualPetClass(100, 20, 80); // not sure
																	// what
																	// should be
																	// in ()
		// how would i display starting values for all 3 atributes here? amount
		// = 100?
		// how would i have different ticker rates for each attribute?
		
		do{
		
		//lola.displayPetStatus();
		
		while (lola.feedLola().equals("throw food") || lola.waterLola().equals("played in her water") || lola.walkLola().equals("refused to walk")) {
			
			lola.tick();
		}

		lola.feedLola();
		lola.waterLola();
		lola.walkLola();
		lola.displayPetStatus();
		lola.tick2();
		}
		while (lola.currentFood >0 && lola.currentWater > 0 && lola.currentWalk > 0);

	}
}
