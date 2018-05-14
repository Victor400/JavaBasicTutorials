package Introduction;

public class Methodandclass {

	//Class is a blueprint or template of an object
	//Object is anything present e
	
	
	/* class account, car , human, phone, computer, food, house, school, employee, student, 
	 * A class is defined by its xtics, variables or data types
	 * Method in a class means actions or functions
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
	 *   
	 *   
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
	 *      re
	 *   
	 *   }
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
		student1.address = "2 clampton";
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
		
	   
		

	}

}
