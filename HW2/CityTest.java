/**@author Isaac Angle
 * This is the main class which simulates a town
 * that has buildings and people in it*/
package HW2.edu.whitworth.spokane;

public class CityTest {
	public static void main(String[] args) {
		Teacher[] SchoolEmployees = {new Teacher("Darek", "209-888-9087",34,5,"Doctrite",100),
				new Teacher("John", "209-888-5555",25,2,"Masters",50)};
		
		Kid[] students = {new Kid("Jack","208-666-7777",8,"Butterfinger"),new Kid("susie","208-664-6689",8,"KitKat"),
				new Kid("Steve","208-004-6789",8,"KitKat"), new Kid("Isabelle","208-669-6689",8,"KitKat")};
		
		Police[] lawEnforcers = {new Police("John","208-900-9999",45,Role.CHIEF, 400),
				 new Police("Carter","208-900-0009",20,Role.SARGENT, 400)};
		
		Building[] buildings = {new CityHall("City Hall", "2245 N West Street",lawEnforcers),
				new School("University Highschool", "4121 N University",SchoolEmployees,students)};
		// making a teacher called jan
		Teacher jan = new Teacher("Jan", "208-344-5555", 34, 5,"Doctrite",50);
		System.out.println(jan.getName() + " has " + jan.getMoneyAmount() + " dollars ");
		
		jan.payEmployee(100);
		
		System.out.println(jan.getName() + " has " + jan.getMoneyAmount() + " dollars ");
		
		//printing out the teachers at the school
		for(int i = 0; i < ((School)buildings[1]).getTeachers().length; i++) {
			System.out.println(((School)buildings[1]).getTeachers()[i].getName());
		}
		System.out.println("");
		
		for(int i = 0; i < ((School)buildings[1]).getStudents().length; i++) {
			System.out.println(((School)buildings[1]).getStudents()[i].getName());
		}
		System.out.println("");
		for(int i = 0; i < ((CityHall)buildings[0]).getOccupants().length; i++) {
			System.out.println(((CityHall)buildings[0]).getOccupants()[i].getName());
		}
	}

}
