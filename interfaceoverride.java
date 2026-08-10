package capg.demos;

interface Greeting{
	void hello();
}

public class LambdaDemo {
	public static void main(String[] args) {
		
		Greeting g = new Greeting() {
			
			@Override
			public void hello() {
				System.out.println("We are printing.."); 
			}
		};
		
		g.hello();
	}
}
