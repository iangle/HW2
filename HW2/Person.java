/**@author Isaac Angle
 * This class is the abstract class that all
 * citizens of Spokane will draw from*/
package HW2.edu.whitworth.spokane;

public abstract class Person {
	
	private String name = "Isaac";
	private String phoneNumber = "509-860-309";
	private int age = 20;
	
	/**@return returns the name of the citizen*/
	public String getName() {
		return name;
	}

	/**@param takes a name and replaces the citizens name with its*/
	public void setName(String name) {
		this.name = name;
	}

	/**@return returns the phoneNumber of the citizen*/
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**@param phoneNumber a number from the user, replaces the citizens number with it*/
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**@return returns the age of the citizen*/
	public int getAge() {
		return age;
	}

	/**@param age, an age that replaces the citizens age*/
	public void setAge(int age) {
		this.age = age;
	}

	/**@param name,number,age. the name, number, and age of a person -- this is the default constructor*/
	Person(String name, String number, int age){
		this.name = name;
		this.phoneNumber = number;
		this.age = age;
	}
}
