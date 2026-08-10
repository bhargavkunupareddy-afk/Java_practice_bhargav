package capg.demos;
 
interface Greeting{   
	void hello(String name, String dept);
	void bye();
}
 
public class LambdaDemo {
	public static void main(String[] args) {
		
		Greeting g = new Greeting() {
			
			@Override
			public void hello(String name, String dep) {
				System.out.println("Hello method");
			}
			
			@Override
			public void bye() {
				System.out.println("bye method");
			}
		};
		
		g.hello("Ravi","HR");
		g.bye();
	}
}
 
 
