package tutorial;

public class Test {

	// The static block only gets called once, no matter how many objects of that type you create.
	static{
		System.out.println("Static");
	}

	// This gets called everytime the class is constructed. 
	{
		System.out.println("Non-static block");
	}
}
