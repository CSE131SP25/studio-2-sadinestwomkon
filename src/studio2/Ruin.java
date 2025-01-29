package studio2;

public class Ruin {

	public static void main(String[] args) {
		
		int startAmount = 100;
		int i = 0;
		int winLimit = 110;
		int ruin = 90;
		double winChance = Math.random();
		int totalSimulations = 10;
		int x = 0;
		
		while (x <= totalSimulations ) {
		
			while (startAmount >= ruin && startAmount <= winLimit) {
				double y = Math.random();
				
				if (y < winChance) {
					startAmount = startAmount + 1;
					i++;
					System.out.println("WIN " + startAmount);
					
			} else {
				startAmount = startAmount - 1;
				i++;
				System.out.println("LOSE " + startAmount);
	
			}
				System.out.println (i);
	
		}
		x++;
		if (startAmount >= winLimit) {
		System.out.println ("Simulation " + x + "WIN " + i); 
			
		} else  {
			System.out.println ("Simulation " + x + "LOSE " + i);
		}
		i = 0;
		startAmount = 100;
	 
		}
	}
}


