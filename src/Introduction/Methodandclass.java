package Introduction;

public class Methodandclass {

	//Class is a blueprint or template of an object
	//Object is anything present e
	
	
	/* class account, car , human, phone, computer, food, house, school, employee, student, 
	 * A class is defined by its xtics, variables or data types
	 * Method in a class means actions or functions
	 * 
	 * class Human(){
	 * 
	 *   String name;
	 *   String colour
	 *   String race
	 *   String leg
	 *   String origin
	 *   String eyes
	 *   
	 *   void move()
	 *   void run()
	 *   void smile()
	 *   void desires()
	 *   
	 *   }
	 *     
	 *   Class Student()
	 *   
	 *   {
	 *      String name
	 *      String course
	 *      int age
	 *      String address
	 *      int phone number
	 *      
	 *      void Takeexams()
	 *      void learn()
	 *      void interact()
	 *   
	 *   }
	 *   
	 *   
	 *   Class Car(){
	 *   String name
	 *   String colour
	 *   String model
	 *   int yearmodel
	 *   
	 *   
	 *   
	 *   void accelerate()
	 *   void speed()
	 *   void slowdown()
	 *   void reverse()
	 *   
	 *   }
	 *  Class Food(){
	 *  String name2
	 *  String type2
	 *  String colour2
	 *  int bestbeforedate
	 *  int expirydate
	 *  
	 *  
	 *  void nutrition
	 *  void energy
	 *  void growth
	 *  void allergy
	 *  
	 *  }
	 *  
	 *  Class Account(){
	 *  String name3;
	 *  String type3;
	 *  String address2;
	 *  int accountnumber;
	 *  double accountbalance;
	 *  
	 *  void transfer()
	 *  void open()
	 *  void close()
	 *  void deactivate()
	 *  void activate()
	 * 
	 *  }
	 *  Class Phone(){
	 *  String name
	 *  String model
	 *  int phonenumber
	 *  
	 *  void playingvideo
	 *  void receivingcalls
	 *  void chargingbattery
	 *  void callingout
	 *  
	 *  }
	 *  Class House(){
	 *  String name
	 *  String address3
	 *  int number
	 *  String type
	 *  
	 *  void sale
	 *  void rent
	 *  void lease
	 *  void auction
	 *  
	 *  }Class School(){
	 *  String name;
	 *   String address;
	 *   int numberofstudents;
	 *   int numberofteachers;
	 *   
	 *   
	 *   void teaching()
	 *   void learning()
	 *   void takingexams()
	 *   void playing
	 *   
	 *   }Class Employee(){
	 *    String name;
	 *    String address;
	 *    int phonenumber;
	 *    String NInumber;
	 *    
	 *    void claimincentitives
	 *    void claimexpenses
	 *    void claimpension
	 *    void vacation
	 *
	 *
	 *  
	 *  
	 *  
	 *  }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To use this class Student, call and instantiate a new class student()
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		
		student1.name = " Stephen";
		System.out.println("This student name is==========" + student1.name );
		student1.address = "2 clampton,London";
		System.out.println("This student adress is=========== " + student1.address );
		student1.age = 30;
		System.out.println("This student age is======= " + student1.age);
		
		student1.course = "Pharmacy";
		System.out.println("This student course is======= " + student1.course);
		student1.phonenumber = 07457625657;
		System.out.println("This student phonenumber is========== " + student1.phonenumber);
		
		student1.interract();
		student1.learn();
		student1.takeexams();
		
	   
		 Car Car1 = new Car();
		 Car Car2 = new Car();
		 Car Car3 = new Car();
		 Car Car4 = new Car();
		 
		 Car1.name = "Toyota";
		 System.out.println("This is Car name======== " + Car1.name);
		 
		 Car1.model = "corrolla";
		 System.out.println("This is Car model============= " + Car1.model);
		 
		 Car1.colour = "Blue";
		 System.out.println("This is Car colour=========== " + Car1.colour);
		 
		 Car1.yearmodel = 2015;
		 System.out.println("This is Car yearmodel======== " + Car1.yearmodel);
		 
		 Car2.name = "Honda";
		 System.out.println("This is Car name======= " + Car2.name);
		 
		 Car2.model = "prelude";
		 System.out.println("This is Car model======= " + Car2.model);
		 
		 Car2.colour = "Black";
		 System.out.println("This is Car colour======= " + Car2.colour);
		 
		 Car2.yearmodel = 2017;
		 System.out.println("This is Car yearmodel======= " + Car2.yearmodel);
		 
		 
		 Car1.accelerate();
		 Car1.brake();
	     Car1.slowdown();
	     Car1.reverse();
	     
	     Car2.accelerate();
	     Car2.brake();
	     Car2.slowdown();
	     Car2.reverse();
	     
			
	     Food Food1 = new Food();
	     Food Food2 = new Food();
	     Food Food3 = new Food();
		 
		 
		 Food1.name2 = "Tomato";
		 System.out.println("This is Food name======= " + Food1.name2);
		 
		 Food1.type2 = "vegetables";
		 System.out.println("This is Food type=======" + Food1.type2);
		 
		 Food1.colour2 = "red";
		 System.out.println("This is Food colour====== " + Food1.colour2);
		 
		 Food1.bestbeforedate= 01/01/2015;
		 System.out.println("This is best before date=====" + Food1.bestbeforedate);
		 
		 Food1.expirydate = 01/01/2018;
		 System.out.println("This is best before date====== " + Food1.expirydate);
		 
		 Food1.allergy();
		 Food1.energy();
		 Food1.nutrition();
		 Food1.growth();
		 
		 
		 Account Account1 = new Account();
		 Account Account2 = new Account();
		 Account Account3 = new Account();
		 Account Account4 = new Account();
		 
		 Account1.name3 = "Victor" + "" + "" + "" + "Adesina";
		 System.out.println("This is the account name====== " + Account1.name3 );
		 
		 Account1.type3 = "Current" + "" + "Account";
		 System.out.println("This is the account type======= " + Account1.type3);
		 
		 Account1.address2 = "22 Water Lane, London";
		 System.out.println("This is the account address=====" + Account1.address2);
		 
		 Account1.accountnumber = 121398234;
		 System.out.println("This is the account number======= " + Account1.accountnumber);
		 
		 Account1.balance = 10000;
		 System.out.println("This is the account balance=======" + Account1.balance);
		 
		
		 Account1.transfer();
		 Account1.open();
		 Account1.close();
		 Account1.deactivate();
		 Account1.activate();
		 
		 Phone Phone1 = new Phone();
		 Phone Phone2 = new Phone();
		 
		 Phone1.name3 = "Samsung galaxy";
		 System.out.println("This is the phone name==== " + Phone1.name3 );
		 
		 Phone1.model2 = "S8";
		 System.out.println("This is the phone model==== " + Phone1.model2 );
		 
		 Phone1.colour3 = "White";
		 System.out.println("This is the phone colour===== " +Phone1.colour3);
		 
		 Phone1.phonenumber2 = 07544123456;
		 System.out.println("This is the phone number====== " + Phone1.phonenumber2);
		 
		
		 Phone1.chargingbattery();
		 Phone1.playingvideo();
	     Phone1.callingout();
		 Phone1.receivingcalls();
		 
		 House House1 = new House();
		 House House2 = new House();
		 
		 House1.name4 = "Vintage House";
		 System.out.println("This is the name of House===== " + House1.name4);
		 
		 House1.number3 = 20;
		 System.out.println("This is the number of House =====" + House1.number3);
		 
		 House1.address3 = "Vintage close";
		 System.out.println("This is the address of House==== " + House1.address3);
		 
		 House1.type3 = "Terraced House";
		 System.out.println("This is the type of House==== " + House1.type3);
		 
		 House1.rent();
		 House1.sale();
		 House1.lease();
		 House1.auction();
		 
		 School School1 = new School();
		 School School2 = new School();
		 
		 School1.name = "Browney Academy";
		 System.out.println("This is the name of school===== " + School1.name);
		 
		 School1.address = "30 Browney close";
		 System.out.println("This is the address of school =====" + School1.address);
		 
		 School1.numberofstudents = 2500;
		 System.out.println("This is the number of students==== " + School1.numberofstudents);
		 
		 School1.numberofteachers = 50;
		 System.out.println("This is the number of teachers==== " + School1.numberofteachers);
		 
		 School1.learning();
		 School1.takingexams();
		 School1.playing();
		 School1.teaching();
		 
		 Employee Employee1 = new Employee();
		 Employee Employee2 = new Employee();
		 
		 Employee1.name = "Nelson Smith";
		 System.out.println("This is the name of the employee========" + Employee1.name);
		 
		 Employee1.address = "120 Shields road";
		 System.out.println("This is the address of employee========" + Employee1.address);
		 
		 Employee1.NInumber = "AB245312B";
		 System.out.println("This is the employee NI number======" + Employee1.NInumber);
		 
		 Employee1.phonenumber = 07456433215;
		 System.out.println("This is the employee phone number======" + Employee1.phonenumber);
		 
		 Employee1.claimexpenses();
		 Employee1.claimpension();
		 Employee1.claimincentives();
		 Employee1.vacation();
		 
		 
	
		 
		 
		 
		 
		 
		
				 
				 
		 
		 
		 

	}
  
  

}
