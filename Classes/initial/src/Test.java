// http://docs.oracle.com/javase/tutorial/java/javaOO/initial.html
// http://stackoverflow.com/questions/2420389/static-initialization-blocks
public class Test {

	// The static block only gets called once, no matter how many objects of that type you create.
	static{
		System.out.println("Static");
	}

	// This gets called everytime the class is constructed. 
	{
		System.out.println("Non-static block");
	}

	public static void main(String[] args) {
		Test t = new Test();
		Test t2 = new Test();
	}
}
