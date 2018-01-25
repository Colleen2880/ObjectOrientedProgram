package objectOrientedProgramming;

public class Testvehicle {

	public static void main(String[] args) {
		
		//create three vehicles
		//created motors, add motor name into vehicle, and print
		Motor s = new Motor(8, 450, "gas");
		Vehicle sports = new Vehicle("Dodge", "Charger", 2016, 45000.00, s);
		System.out.println(sports + "\n"+ s.toString());
		
		//add line for spacing between output
		System.out.println("\n");
		
		Motor s1 = new Motor(6, 300, "gas");
		Vehicle sports1 = new Vehicle("Chevy", "Cavalier", 2016, 25000.00, s1);
		System.out.println(sports1 + "\n"+ s1.toString());
		
		System.out.println("\n");
		
		Motor s2 = new Motor(6, 345, "gas");
		Vehicle sports2 = new Vehicle("chevy", "trailblazer", 2016, 35000.00, s2);
		System.out.println(sports2 + "\n"+ s2.toString());
		
		
		
	}



}

