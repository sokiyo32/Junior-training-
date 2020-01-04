package lab;

public class BankAccountApps {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BanKAccount acc1 = new BanKAccount("3453677277",1000);
		//BanKAccount acc2 = new BanKAccount("3453677277",2500);
		//BanKAccount acc3 = new BanKAccount("3453677277",250);
		
		acc1.payBill(522);
		acc1.makeDeposit(650);
		acc1.accrue();
		
		acc1.setName("DEsat");
		System.out.println(acc1.toString());
	}
}

	class BanKAccount implements IInterest{
		// properties of bank account 
		
		private static int iD = 1000; // internal id unique id for each customer 
		// we made encapsulation by adding private that means it will ensure that the client doesn't have access
		//to these variable except through the method we provided them 
		private String accountnumber;//combination of iD + random 2-digit number + the first 2 of SSN
		private static final String routingnumber = "0055443322"; // static cause it is the case for all class or object final>>constant in java we can't change
		private String name;
		private String SSN;
		private double balance;
		
	
	// first step create the constructor
		
		public BanKAccount(String SSN, double initDeposit){
			balance = initDeposit;
			//System.out.println("New Account Created");
			this.SSN = SSN;
			iD++;
			setAccounNumber ();
			//System.out.println(iD);
			
		} 
		
		private void setAccounNumber (){
			int random = (int) (Math.random() * 100);
			//System.out.println("random" + random);
			 accountnumber = iD + ""+random + SSN.substring(0,2);
			 System.out.println("Your accoun number: "+ accountnumber);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		// methods for deposit
		
		public void payBill(double amount){
			balance = balance - amount;
			System.out.println("Paying Bill: "+ amount);
			ShowBalance();
			
		}
		
		public void makeDeposit(double amount){
			balance = balance + amount;
			System.out.println("Make deposit: "+ amount);
			ShowBalance();
		}
		
		// to display about the balance we need to create show balance 
		
		public void ShowBalance(){
			System.out.println("Balance: £" + balance );
		}
		public void accrueInterest(){
			
		}

		@Override
		public void accrue() {
			 balance = balance * (1+ rate/100);// e.g the central bank set the value of the interest
			 ShowBalance(); 
		}
		
		// inherited method from the object 
		@Override
		
		public String toString(){
			return "[Name: " + name + "]\n[Account Number: " + accountnumber +"]\n" + "[ Routing Number: " + routingnumber + "]\n"+  "[ Balance: " + balance + "]\n";
			
		}
		 
			 
	
	
	}
	
	

