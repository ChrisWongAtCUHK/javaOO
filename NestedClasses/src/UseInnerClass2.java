public class UseInnerClass2 { 
	public static void main(String[] args) { 
		Object obj = new Object() { 
			public String toString() { 
				return "Annonymous object"; 
			} 
		}; 
		System.out.println(obj.toString()); 
	} 
} 
