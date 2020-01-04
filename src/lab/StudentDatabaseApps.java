package lab;

public class StudentDatabaseApps {

	 
	public static void main(String[] args) {
		StudentDatabase stu1 = new StudentDatabase("dereje","2345632");
		StudentDatabase stu2 = new StudentDatabase("maritu","234563552");
		StudentDatabase stu3 = new StudentDatabase("Zeritu","234563332");
		// System.out.println(stu1);
		 
		stu1.enroll("multimedia");
		stu1.enroll("Antenna");
		
		//stu1.showCourses();
		//stu1.checkBalance();
		stu1.pay(100);
		//stu1.checkBalance();
		System.out.println(stu1.toString());
		
	}
}
	
	class StudentDatabase{
		
		// variables 
		
		String name;
		private static int iD = 100;
		String SSN;
		String email;
		int phone;
		String city;
		String state;
		String userID;
		private String courses = "";
		private static final int costofcourse = 146;
		private int balance =0;
	
		
		// Use encapsulation to set variables (phone, city, state)
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPhone() {
			return phone;
		}
		public void setPhone(int phone) {
			this.phone = phone;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		
		
		public StudentDatabase(String name,String SSN ){
			email = name + "@student.unibs.it";
			this.name= name;
			this.SSN= SSN;
			iD++;
			GenerateauserID();
			//System.out.println("new StudentDatabase is created: ");
			//System.out.println(iD);
			System.out.println( "Your email is: "+email);
			
			
		}
		
		private void GenerateauserID(){
			int randomPIN = (int)(Math.random()*9000)+1000;
			String lastFourDigits = "";     //substring containing last 4 characters
			 
			if (SSN.length() > 4) 
			{
			    lastFourDigits = SSN.substring(SSN.length() - 4);
			} 
			else
			{
			    lastFourDigits = SSN;
			}
			 
			//System.out.println(lastFourDigits);
			 
			//System.out.println("random: " + randomPIN);
			 
			userID = iD + ""+randomPIN+ lastFourDigits ;
			 System.out.println("Your ID is: "+ userID );
		}
		
		// methods 
		
		public void enroll(String course){
			this.courses = this.courses + " : "+  course;
			//System.out.println(courses);
			balance = balance + costofcourse;
		}
		
		public void pay(int amount){
			System.out.println("tution fee payment:" + amount);
			balance = balance -amount;
			
			 
		}
		public void checkBalance(){
			System.out.println("Total balance: £" + balance);
		}
		
		public String toString(){
			 return  "[Name:- " + name +"]\n[Courses:- " + courses +"]\n[Balance:- " + balance +"]";
		}
		public void showCourses(){
			System.out.println(courses);
		}
		
		
		
		
		
	}


