package OOP;

public class BankAccountApp {
  
	public static void main(String[] args){
		// creating a new bank account  >> think instantiate an object 
		
		BankAccount acc1 = new BankAccount();
		//acc1.name = "deseta ";
		//acc1.balance=10000;
		
		// with Encapsulation : public API method 
		acc1.setName("dera");
		System.out.println(acc1.getName());
		
		acc1.setSsn("4345632");
		System.out.println("SSN: "+acc1.getSsn());
		
		
		acc1.setRate();
		acc1.increaseRate();
		
		
		acc1.deposit(1500);
		acc1.deposit(1200);
		acc1.deposit(1800);
		acc1.withdraw(2000);
		
		
		
		System.out.println(acc1.toString());
				
		
	//	BankAccount acc2 = new BankAccount("checking Account");
	//	BankAccount acc3 = new BankAccount("Saving Account", 500); // that process is called overloading using same method but d/t name
	    
	    /*
		System.out.println(acc1.routingnumber);
		System.out.println(acc2.routingnumber);
		System.out.println(acc3.routingnumber);*/
		
		//acc3.checkbalance();
	
		// Demo for inheritance
		/*
		CDAccount cd1 = new CDAccount();
		cd1.balance=12000;
		cd1.interestRate ="4.5";
		cd1.name ="Sokiyo";
		cd1.accounttype="CD account";
		System.out.println(cd1.toString());
		cd1.compount();
		*/
	
	
	}
}
