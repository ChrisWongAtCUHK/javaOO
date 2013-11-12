package Q1;

import java.util.*;

//: Q1/SolorSystem.java
/** 
 * <pre>
 * Nested class demo
 * </pre>
 */
public class SolarSystem {
	static Scanner sc = new Scanner(System.in);
	static Planet[] planets;

	int numPlanets;
	static String SSName;

	/** 
	  * Constructor for user input
	  */
	public SolarSystem(){
		System.out.println("Name of solar system?");
		SSName = sc.nextLine();
		System.out.println("How many planets in your solar system?");
		numPlanets = sc.nextInt();
		sc.nextLine();
		planets = new Planet[numPlanets];
	}

	/** 
	  * Inner class 
	  */
	public class Planet{
		public String planetName;
		public int disFromSun; //millions of miles

		/** 
		  * Inner class constructor with user input
		  * @param planetNum the planet number, plus 1 since array index starts from 0
		  */
		public Planet(int planetNum){
			System.out.println("What is the name of planet number  " + (planetNum+1));
			planetName = sc.nextLine();
			System.out.println("How far is it from the sun?");
			disFromSun = sc.nextInt();
			sc.nextLine();
		}
	}
	
	/** 
	  * Display method to show all details of an instance
	  * @return no return value
	  */
	public void printDetails(){
		System.out.println("\n\nThe name of the solar system is " + this.SSName);
		System.out.println("The number of planets of the solar system is " + this.planets.length);
		for(int i = 0; i < this.planets.length; i++){
			System.out.println("Planet name: " + this.planets[i].planetName + "\nDistance from Sun: " + this.planets[i].disFromSun);
		}
	}
}///:~
