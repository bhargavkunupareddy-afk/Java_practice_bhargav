package capg.demos;
 
public class SwitchDemo {
	public static void main(String[] args) {
		
		double discount;
		String category = "CLOTHING";
		
		switch(category) {
		
		case "ELECTRONICS" :
			discount = 0.1;
			break;
			
		case "CLOTHING" :
			discount = 0.2;
			break;
			
		default:
			discount = 0.0;
		}
		
		System.out.println("The discount is " + discount);
	}
}
 
