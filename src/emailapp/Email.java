package emailapp;
import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10 ;
	private String alternateEmail;
	private String email;
	private String companySuffix = "aeycompany.com";
	
	//Constructor to receive the first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created "+this.firstName+" "+this.lastName);
		
		//Call a method asking for the department- return the department. 
		this.department = setDepartment();
		// What we are doing here , is that we are talking the class var department which is private and we are setting that
		//by using the below setDepartment  by asking the user to enter the information.
		
		System.out.println("Department is "+this.department);// To print the department again. 
		
		
		//Call a method asking for a random password. 
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: "+ this.password);
		
		
		
		//Combine Elements to call for a Generate email. 
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		System.out.println("Your email is:" +email);
		
	}
	
	
	
	//Ask for the department
	public String setDepartment() {
		System.out.print("Enter the department\n1 For Sales \n2 For Development \n3 For Accounting \n0 For none");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {return "sales";}
		else if(depChoice == 2) {return "Development";}
		else if(depChoice == 3) {return "Accounting";}
		else {return "";}
		
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890!@#$";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i]= passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
	//Set mailbox capacity -- The reason we did not put them in the constructor is that we already have them in the constructor as def values. 
	public void setMailboxCapacity(int capacity) { //This is actually encapsulation - we are making this method public
		this.mailboxCapacity = capacity; // and hiding the actual capacity. 
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Change the password. 
	public void setchangePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity(){
		return mailboxCapacity; //mailboxCapacity is the class variable
	}
	public String getAlternateEmail() {
		return alternateEmail; // Class variable - not a method.
	}
	public String getchangePassword() {
		return password;
	}
	
	public String showInfo(){
		return "DISPLAY NAME: "+firstName+" "+lastName +
				"COMPANY EMAIL: " + email+
				"MAILBOX CAPACITY: "+mailboxCapacity+"MB";
	}
	
	
	
	
}
