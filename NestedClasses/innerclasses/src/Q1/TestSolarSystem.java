package Q1;

// http://www.java-forums.org/new-java/34906-inner-classes-problem.html
public class TestSolarSystem {
	public static void main(String[] args) {
		SolarSystem ourSolarSystem = new SolarSystem();
		SolarSystem.Planet ourPlanets = ourSolarSystem.new Planet();
		ourPlanets.printDetails();
	}

}
