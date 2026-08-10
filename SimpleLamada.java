package capg.demos;

interface Greeting{
	void hello(String name, String dept);
}

public class LambdaDemo {
	public static void main(String[] args) {
		
		Greeting g = (greet,dep) -> System.out.println("Welcome you " + greet + " and you are working in "+ dep); 
		
		g.hello("Varun","IT");
		g.hello("Ravi","HR");
	}
}
