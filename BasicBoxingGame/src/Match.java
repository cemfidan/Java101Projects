import java.util.Random;

public class Match {
	 Fighter fighterUser;
	 Fighter fighterAI;
	 int minWeight;
	 int maxWeight;
	 
	 public Match(Fighter fighterUser, Fighter fighterAI, int minWeight, int maxWeight) {
		 this.fighterUser = fighterUser;
		 this.fighterAI = fighterAI;
		 this.minWeight = minWeight;
		 this.maxWeight = maxWeight;
	}
	 
	 public void run() {
	        if (checkWeight()) {
	            while (fighterUser.health > 0 && fighterAI.health > 0) {
	            	
	            	System.out.println(" ");
	            	System.out.println("========### NEW ROUND ###===========");
	            	
	            	Random random = new Random();
	            	
	            	int chance = random.nextInt(2);
	            	
	            	if (chance == 0) {
	            		fighterAI.health = fighterUser.hit(fighterAI);
		                if (isWin()){
		                    break;
		                }
	            	} else {
	            		fighterUser.health = fighterAI.hit(fighterUser);
		                if (isWin()){
		                    break;
		                }
	            	}
	            	
	                printScore();
	            }

	        } else {
	            System.out.println("The weights of the fighters do not match.");
	        }

	    }

	    public boolean checkWeight() {
	        return (fighterUser.weight >= minWeight && fighterUser.weight <= maxWeight) && (fighterAI.weight >= minWeight && fighterAI.weight <= maxWeight);
	    }

	    public boolean isWin() {
	        if (fighterUser.health == 0) {
	        	System.out.println(" ");
	        	System.out.println("Match Winner: " + fighterAI.name);
	            return true;
	        } else if (fighterAI.health == 0){
	        	System.out.println(" ");
	        	System.out.println("Match Winner: " + fighterUser.name);
	            return true;
	        }

	        return false;
	    }


	    public void printScore() {
	    	System.out.println("------------");
	        System.out.println(fighterUser.name + " Health: " + fighterUser.health);
	        System.out.println(fighterAI.name + " Health: " + fighterAI.health);
	        System.out.println(" ");
	    }
}
