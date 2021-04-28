package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email em1 = new Email("Rituraj","Basu");  //all of the functionality is hapenning with one single line - all are implemented
	                                             // by constructors. 
	
		em1.setAlternateEmail("j.s@gmail.com");
		System.out.println(em1.getAlternateEmail());// Testing out Getter and Setters
		
		
		em1.setchangePassword("Bolbona");
		System.out.println(em1.getchangePassword());// Testing out getter Setters
		
		System.out.println(em1.showInfo());
	}
	
}
