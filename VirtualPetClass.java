package VirtualPetProject;


public class VirtualPetClass {

	
	int full;
	int hydrated;
	int walkLimit;
	// int bedTime; too complicated
	// int play; too complicated
	int currentFood;
	int currentWater;
	int currentWalk;
	//int foodLimit; // max capacity for food
	//int waterLimit; // max capacity for water
	//int walkLimit; // max capacity for goWalk
	String lolaFoodAction;//so that lola is full when the program starts
	String lolaWaterAction;
	String lolaWalkAction;
	

/*	public VirtualPetClass(feedInput; waterInput; walkInput) {

		currentFood = feedInput;// current food status
		foodLimit = 50;// capacity of food
		currentWater = waterInput;// current water status
		waterLimit = 50;// capacity of water
		//currentWalk = walkInput;// current walk status
		walkInput = currentWalk;
		walkLimit = 50;// capacity of water
	}
*/
	
	  public VirtualPetClass(int feed, int giveWater, int walk){
	  
	  currentFood = feed;//current food status 
	  full = 100;//capacity of food
	  currentWater = giveWater;//current water status 
	  hydrated = 100;//capacityof water 
	  currentWalk = walk;//current walk status 
	  walkLimit =100;//capacity of water 
	  }
	 
	public String feedLola() {

		if (currentFood > full) {
			currentFood = full;
			lolaFoodAction = "throw food";
		} else if (currentFood == full) {
			currentFood = full;
			lolaFoodAction = "full & satisfied";
		} else {
		//	currentFood = ;// or would it equal the ticker?
			lolaFoodAction = "very hungry";
		}
		return lolaFoodAction;
	}

	public String waterLola() {

		if (currentWater > hydrated) {
			currentWater = hydrated;
			lolaWaterAction = "played in her water";
		} else if (currentWater == hydrated) {
			currentWater = hydrated;
			lolaWaterAction = "nice & hydrated";
		} else {
		//	currentWater =+;// or would it equal the ticker?
			lolaWaterAction = "very thirsty";
		}
		return lolaWaterAction;
	}

	public String walkLola() {

		if (currentWalk > walkLimit) {
			currentWalk = walkLimit;
			lolaWalkAction = "refused to walk";
		} else if (currentWalk == walkLimit) {
			currentWalk = walkLimit;
			lolaWalkAction = "engaged & intent";
		} else {
			currentWalk = walkLimit;// or would it equal the ticker?
			lolaWalkAction = "very bored & lazy";
		}
		return lolaWalkAction;
	}

	public void tick() {
		currentFood = currentFood - 15;
		currentWater = currentWater - 20;
		currentWalk = currentWalk - 30;
	}
	
	public void tick2(){
		currentFood = currentFood - 25;
		currentWater = currentWater - 15;
		currentWalk = currentWalk - 10;
	}

	public void displayPetStatus() {

		System.out.println("Lola is " + lolaFoodAction + " "
				+ lolaWaterAction + " " + lolaWalkAction
				+ ".");

	}
}
