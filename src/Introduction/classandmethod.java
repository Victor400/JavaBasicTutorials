package Introduction;

public class classandmethod {
	
	/*
	 * 
	 * array is vaiable that holds mutipledata of the same datatypes 
	 * 
	 * this is the way we you declare 
	 * 
	 * datatype[] varaible_name = {values_to_the _array}
	 * 
	 * an array stored values as index array start its count from Zero 0
	 * to gert value out of an array  variablename Fruits[2];
	 * 
	 * declare an Array[] of Menswear, onlinestores, cars 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 
        // 
		String[] Fruits = {"mango","orange", "grape", "apple", "melon", "pineapple" };
		System.out.println( " this is index 3 ===== ======== " + Fruits[2]);

		System.out.println("this is index 0 =====" + Fruits[0]);
		System.out.println("this is index 1 =====" + Fruits[1]);
		System.out.println("this is index 3 =====" + Fruits[3]);
		System.out.println("this is index 4 =====" + Fruits[4]);
		System.out.println("this is index 5 =====" + Fruits[5]);
		
		
		String[] Menswear = {"shoes", "socks","belt", "ties", "perfume", "glasses", "chain"};
		String[] Onlinestores = {"Amazon", "Ebay", "Zara", "Iceland", "Asda", "Sainsbury"};
		String[] Cars = {"Honda", "Chevrolet", "BMW", "Bentley", "Mazeratti", "Rangerover"};
		
		// to get the count ot to know th lenth of an array?
		
		 int lengthMen = Menswear.length;
		 
		 System.out.println("the legnth of our mens Array is === " + lengthMen);
		 
		 int Onlinestores1 = Onlinestores.length;
		 System.out.println("the length of Onlinestores Array is ==== " + Onlinestores1);
		 
		 int Cars30 = Cars.length;
		 System.out.println("the length of our Car Array is ====" + Cars30);
		 
		 
		 		 if(Onlinestores1 == lengthMen ) { 
		 			 
		 			 System.out.println("Both array are equal values");
		 		 }else {
		 			 System.out.println("Both arrays are not equal"); 
		 		 }
				 
		 
		 
		   // to display the content of an Array using for loop
		 	// for loop for( variable_inittialization, ieration, increament  ){}	 
		
		
		   // using for loop to display content in an array
		 		 for(int a = 0; a<=Cars.length-1; a++){
		 			 System.out.println(Cars[a]);
		 		 }
		 		 
		 		 for(int g= 0; g<=Onlinestores.length-1; g++) {
		 			 System.out.println("This contains the names of our Stores " +" " + Onlinestores[g]);
		 		 }
		 		 
		 	// Assigment is declare an array of football clubs in uk, cities in uk, , Carearer type and loop them out 
		 		 
		 		  //  Java | Selenium | testNg|Gherkin > scenario  Cucumber > BDD | Git version repository |Maven | Jenkins > CI/CD  |  \ UFT 
		 		// for a test Automation Engineer 
		 		 
		 		 
	
		 		 String[] Footballclubs = {"Liverpool", "Tottenham", "Manchester", "Arsenal", "AstonVilla", "Chelsea", "ManUnited", "Everton", "Westham"};
		 		 int Footballclubs50 = Footballclubs.length;
		 		System.out.println("the length of our Footballclub Array is === " + Footballclubs50);
		 		
		 		 for(int f= 0; f<=Footballclubs.length-1; f++) {
		 			 System.out.println("This contains the names of Football clubs" +" " + Footballclubs[f]);
		 		 }
		 		
		 		 String[] Ukcities = {"London", "Newcastle", "Belfast", "Birmingham", "Leeds","Chichester", "Derby", "Peterborough", "Cambridge"};
		 		 int Ukcities200 = Ukcities.length;
		 		 System.out.println("the length of our uk cities Array is ====" + Ukcities200);
		 		 
		 		 for(int U= 0; U<=Ukcities.length-1; U++) {
		 			 System.out.println("This contains the names of Uk cities" + " "+ Ukcities[U]);
		 		 }
		 		 
		 		 
		 		 String [] Careertype = {"Teaching", "Projectmanagement", "softwaretesting", "Youthwork", "Policing", "Counselling", "Dentistry"};
		 		 int Careertype10 = Careertype.length;
		 		 System.out.println("the length of career type array is =====" + Careertype10);
		 		 
		 		for(int V= 0; V<= Careertype.length-1; V++) {
		 			 System.out.println("This contains the names of Career type" + " "+ Careertype[V]);
		 			 
		 		}
		 		 
	}


		 		
}