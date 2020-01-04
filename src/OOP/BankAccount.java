package OOP;

public class BankAccount implements IRate  {
	// bank account going to have
	// define variable 
	String accountnumber;
	
	// static >> belongs to the CLASS not the object instance  
	private static final String routingnumber = "112233";// final is like a constant you can't change it 
	
	// instant variable 
	 private String name;
	 private String ssn;
	 String accounttype;
	 double balance;
	
	// constructor unique methods
		// 1. they are used to define/setup/ initialize properties of an object 
		//2.  constructors are implicitly upon initialization 
		//3. the same name as the class it self
		//4. no return type as all
	// constructor is called as soon as we create an object 
	 BankAccount(){
		 System.out.println("New account created");
	 }
	 
	 // Overloading call the same method name with different arguments
	 
	 BankAccount(String accounttype){
		 System.out.println("New account: " +accounttype );
	 }
	 
	 BankAccount(String accounttype, double initialdeposit){
		 // initialdeposit, accountype, msg are local variable(define within blocks, define with loops) 
		 System.out.println("New account: " +accounttype );
		 System.out.println("New account: " +initialdeposit );
		 String msg = null;
		 
		 if(initialdeposit< 1000){
			 msg = "Error minimum deposit must be at least $1,000";
		 } else {
			 msg = "Thanks for the initial deposit of: $ "+ initialdeposit;
		 }
		 System.out.println(msg);
		 balance = initialdeposit;
	 }
	 
	
	
	// define method 
	 // public available anywhere in the project 
	void deposit(double amount){
		balance = balance + amount;
		showactivities("Deposit");
		
	}
	
	// void available anywhere in the package 
	void withdraw(double amount){
		balance = balance + amount;
		showactivities("Deposit");
		
		
	}
	// private only available in the class 
	// can only called from within the class 
	private void showactivities(String activity){
		 System.out.println("showing recent transaction:" + activity);	
		 System.out.println("showing recent activities" + balance);	
		 
		
	}
	
	

	public void setName(String name) {
		this.name = "Mr. "+ name;
	}
	public String getName() {
		return name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	// Interface methods 
	
	public void setRate(){
		System.out.println("Setting Rate");
	}
	
	public void increaseRate(){
		System.out.println("Increase Rate");
		
	}
	

	void checkbalance(){
		
	}
	void getststus(){
		
	}
	@Override
	public String toString(){
		 
		return " [ NAME: "+ name +". Account#" + accountnumber +". Routing#"+routingnumber+". BALANCE: $ "+ balance+ "]";
	}

	 
}
