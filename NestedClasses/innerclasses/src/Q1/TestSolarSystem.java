package Q1;

// http://www.java-forums.org/new-java/34906-inner-classes-problem.html

//: Q1/SolorSystem.java
/** 
 * <pre>
 * Test for SolarSystem
 * </pre>
 * @see SolarSystem
 * SolarSystem 
 */
public class TestSolarSystem {

	/** Main program */
	public static void main(String[] args) {
		SolarSystem ourSolarSystem = new SolarSystem();
		
		for(int i = 0; i < ourSolarSystem.numPlanets; i++){
			SolarSystem.Planet ourPlanets = ourSolarSystem.new Planet(i);
			ourSolarSystem.planets[i] = ourPlanets;
		}
		
		ourSolarSystem.printDetails();
	}

}
