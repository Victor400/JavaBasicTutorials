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
	 *  Class Food
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
		System.out.println("This student name is " + student1.name );
		student1.address = "2 clampton,London";
		System.out.println("This student adress is " + student1.address );
		student1.age = 30;
		System.out.println("This student age is " + student1.age);
		
		student1.course = "Pharmacy";
		System.out.println("This student course is " + student1.course);
		student1.phonenumber = 07457625657;
		System.out.println("This student phonenumber is " + student1.phonenumber);
		
		student1.interract();
		student1.learn();
		student1.takeexams();
		
	   
		 Car Car1 = new Car();
		 Car Car2 = new Car();
		 Car Car3 = new Car();
		 Car Car4 = new Car();
		 
		 Car1.name = "Toyota";
		 System.out.println("This is Car name " + Car1.name);
		 
		 Car1.model = "corrolla";
		 System.out.println("This is Car model " + Car1.model);
		 
		 Car1.colour = "Blue";
		 System.out.println("This is Car colour " + Car1.colour);
		 
		 Car1.yearmodel = 2015;
		 System.out.println("This is Car yearmodel " + Car1.yearmodel);
		 
		 Car2.name = "Honda";
		 System.out.println("This is Car name " + Car2.name);
		 
		 Car2.model = "prelude";
		 System.out.println("This is Car model " + Car2.model);
		 
		 Car2.colour = "Black";
		 System.out.println("This is Car colour " + Car2.colour);
		 
		 Car2.yearmodel = 2017;
		 System.out.println("This is Car yearmodel " + Car2.yearmodel);
		 
		 
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
		 System.out.println("This is Food name " + Food1.name2);
		 
		 Food1.type2 = "vegetables";
		 System.out.println("This is Food type " + Food1.type2);
		 
		 Food1.colour2 = "red";
		 System.out.println("This is Food colour " + Food1.colour2);
		 
		 Food1.bestbeforedate= 01/01/2015;
		 System.out.println("This is best before date " + Food1.bestbeforedate);
		 
		 Food1.expirydate = 01/01/2018;
		 System.out.println("This is best before date " + Food1.expirydate);
		 
		 Food1.allergy();
		 Food1.energy();
		 Food1.nutrition();
		 Food1.growth();
		 
		 
		 
				 
				 
		 
		 
		 

	}
  
  

}
