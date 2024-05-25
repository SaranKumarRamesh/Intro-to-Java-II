package dragonGame;

import java.util.ArrayList;

public class GameTest {

	public GameTest() {
		
		// Create a array list to play with dragons
		ArrayList<Dragon> dragonList= new ArrayList<>(36);
		
		// Generate 36 dragons for game
		for (int i = 0; i < 3; i++) {
			dragonList.add(new Red("SmallRed" + (i + 1), DragonSize.Small));
			dragonList.add(new Red("MediumRed" + (i + 1), DragonSize.Medium));
			dragonList.add(new Red("LargeRed" + (i + 1), DragonSize.Large));

			dragonList.add(new Green("SmallGreen" + (i + 1), DragonSize.Small));
			dragonList.add(new Green("MediumGreen" + (i + 1), DragonSize.Medium));
			dragonList.add(new Green("LargeGreen" + (i + 1), DragonSize.Large));

			dragonList.add(new White("SmallWhite" + (i + 1), DragonSize.Small));
			dragonList.add(new White("MediumWhite" + (i + 1), DragonSize.Medium));
			dragonList.add(new White("LargeWhite" + (i + 1), DragonSize.Large));
			
			dragonList.add(new Black("SmallBlack" + (i + 1), DragonSize.Small));
			dragonList.add(new Black("MediumBlack" + (i + 1), DragonSize.Medium));
			dragonList.add(new Black("LargeBlack" + (i + 1), DragonSize.Large));
			
			battleDragons(dragonList);
			
			// Rank and print the dragons
            		rankAndPrint(dragonList);
        	}
	}

	// start the battle rounds
	private void battleDragons(ArrayList<Dragon> dragonList) {
		for (Dragon dragon : dragonList) {
			for (Dragon dragon1 : dragonList) {
				if (dragon != dragon1) {
                    battleRound(dragon, dragon1);
                    dragon.resurrect();
                    dragon1.resurrect();
                }
			}
		}
	}
	
	// color modifier variable of change
	private static double getColorModifier(Dragon attacker, Dragon defender) {
	    if (attacker instanceof Red) {
	        if (defender instanceof Green) {
	            return 0.8; // Red vs Green
	        } else if (defender instanceof White) {
	            return 1.2; // Red vs White
	        }
	    } else if (attacker instanceof Green) {
	        if (defender instanceof Red) {
	            return 1.2; // Green vs Red
	        } else if (defender instanceof White) {
	            return 0.9; // Green vs White
	        }
	    } else if (attacker instanceof White) {
	        if (defender instanceof Green) {
	            return 1.1; // White vs Green
	        } else if (defender instanceof Red) {
	            return 0.8; // White vs Red
	        }
	    } else if (attacker instanceof Black) {
	        if (defender instanceof White) {
	            return 0.75; // Black vs White
	        }
	    }
	    return 1.0; // Default modifier
	}

	// run the battle ground simulations
	private static Dragon battleRound(Dragon dragon, Dragon dragon1) {
		Dragon firstDragon;
		Dragon secondDragon;
		
		if(dragon.getInitiative() > dragon1.getInitiative()) {
			firstDragon = dragon;
			secondDragon = dragon1;
		} else if (dragon.getInitiative() > dragon1.getInitiative()) {
			firstDragon = dragon1;
			secondDragon = dragon;
        } else {
            if (Math.random() < 0.5) {
            	firstDragon = dragon;
    			secondDragon = dragon1;
            } else {
            	firstDragon = dragon1;
    			secondDragon = dragon;
            }
        }		
		
    	// Color Modifier include
    	double colorModChange = getColorModifier(firstDragon, secondDragon);
    	firstDragon.changeAttackRankForColor(colorModChange);
		
		// Attack in turn until one of the dragons is killed
        while (!firstDragon.isDead() && !secondDragon.isDead()) {
        	
            // First Dragon attacks the Second Dragon
        	firstDragon.defendAttack(secondDragon);
            if (secondDragon.isDead()) {
                return firstDragon;
            }

            // Second Dragon attacks the First Dragon
            secondDragon.defendAttack(firstDragon);
            if (firstDragon.isDead()) {
                return secondDragon; 
            }

            // If both dragons are still alive, and the first dragon is small, attack two more times
            if (firstDragon.getNumAttacksPerTurn() > 1) {
            	firstDragon.defendAttack(secondDragon);
                if (secondDragon.isDead()) {
                    return firstDragon; // First Dragon wins
                }
            }

            if (firstDragon.getNumAttacksPerTurn() > 2) {
            	firstDragon.defendAttack(secondDragon);
                if (secondDragon.isDead()) {
                    return firstDragon; // First Dragon wins
                }
            }
        }
		return null;
	}

	private static void rankAndPrint(ArrayList<Dragon> dragons) {
        int n = dragons.size();

        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                Dragon dragon1 = dragons.get(j);
                Dragon dragon2 = dragons.get(j + 1);

                // Compare dragons based on the number of wins
                if (winsCounter(dragon1, dragons) < winsCounter(dragon2, dragons)) {
                    // Swap dragons
                    dragons.set(j, dragon2);
                    dragons.set(j + 1, dragon1);
                }
            }
        }

        // Print the ranked dragons
        for (Dragon dragon : dragons) {
            System.out.println(dragon + " - Wins: " + winsCounter(dragon, dragons));
        }
    }
	
	private static int winsCounter(Dragon dragon, ArrayList<Dragon> dragons) {
        // Method to count dragon wins
        int wins = 0;
        for (Dragon opponent : dragons) {
            if (dragon != opponent && !opponent.isDead()) {
                battleRound(dragon, opponent);
                if (opponent.isDead()) {
                    wins++;
                }
                dragon.resurrect();
                opponent.resurrect();
            }
        }
        return wins;
    }

}
